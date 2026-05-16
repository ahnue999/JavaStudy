In double hashing, `hashFunc2()` generates the **step size** used during probing.

Your first hash function determines:

```text id="dx85p0"
where to start
```

The second hash function determines:

```text id="j30a4r"
how far to jump each time
```

---

# 1. First Hash Function

You already have:

```java id="1xjbdz"
public int hashFunc(int key)
{
    return key % maxSize;
}
```

Mathematically:

h_1(k)=k\bmod m

---

# 2. Second Hash Function

Classic Lafore implementation:

```java id="2sn4pi"
public int hashFunc2(int key)
{
    return 5 - key % 5;
}
```

Mathematically:

h_2(k)=R-(k\bmod R)

Where:

- (R) is a prime smaller than table size

---

# 3. Why This Formula?

Suppose:

```text id="s8yxvx"
table size = 13
R = 5
```

Possible step sizes:

```text id="crstjb"
1, 2, 3, 4, 5
```

Never zero.

That’s critical.

---

# 4. Why Step Size Cannot Be Zero

If:

```text id="l4e6e9"
stepSize = 0
```

then probing becomes:

```text id="s6f1eq"
7 → 7 → 7 → 7
```

Infinite loop.

So the second hash must always return:

- nonzero
- preferably relatively prime to table size

---

# 5. Example

Suppose:

```text id="9o8a33"
maxSize = 10
R = 7
key = 37
```

---

## First Hash

```text id="vgj05m"
37 % 10 = 7
```

Start at index 7.

---

## Second Hash

```text id="yjlwmc"
7 - (37 % 7)
= 7 - 2
= 5
```

Step size = 5.

---

# 6. Probe Sequence

If collision occurs:

```text id="zyip1d"
7
7+5 = 12 % 10 = 2
2+5 = 7
...
```

Notice:

- much larger jumps
- fewer clusters

---

# 7. How insert() Changes

Linear probing:

```java id="aq8ww9"
++hashVal;
```

Double hashing:

```java id="vj9j08"
hashVal += stepSize;
```

---

# 8. Full Double-Hash insert()

```java id="l8ntae"
public void insert(int n)
{
    DataItem tmp = new DataItem(n);

    int hashVal = hashFunc(tmp.getKey());

    int stepSize = hashFunc2(tmp.getKey());

    while(hashArray[hashVal] != null &&
          hashArray[hashVal].getKey() != -1)
    {
        hashVal += stepSize;

        hashVal %= maxSize;
    }

    hashArray[hashVal] = tmp;
}
```

---

# 9. find() Also Changes

Very important:

Search must follow the SAME probe sequence.

```java id="z4txi7"
public DataItem find(int key)
{
    int hashVal = hashFunc(key);

    int stepSize = hashFunc2(key);

    while(hashArray[hashVal] != null)
    {
        if(hashArray[hashVal].getKey() == key)
            return hashArray[hashVal];

        hashVal += stepSize;

        hashVal %= maxSize;
    }

    return null;
}
```

---

# 10. delete() Also Changes

Deletion must probe identically too.

Replace:

```java id="7rjlwm"
hashVal++;
```

with:

```java id="4d9nxz"
hashVal += stepSize;
```

---

# 11. Important Rule About Table Size

For double hashing:

- table size should usually be prime
- `R` should be prime and smaller than table size

Example:

| Table Size | Good R |
| ---------- | ------ |
| 13         | 5      |
| 23         | 7      |
| 47         | 13     |

---

# 12. Why Prime Numbers Matter

Without primes, probe sequences may miss slots.

Example:

```text id="7l7jlwm"
table size = 10
step size = 2
```

Sequence:

```text id="w7dr0n"
0 → 2 → 4 → 6 → 8
```

Never reaches odd indices.

Bad.

Prime sizes avoid this.

---

# 13. Mental Model

---

## Linear Probing

```text id="7q1m8v"
walk one step
```

---

## Quadratic Probing

```text id="2o2gjq"
walk using squares
```

---

## Double Hashing

```text id="4djlwm"
each key chooses its own stride length
```

That’s the key idea.

---

# 14. Best Practice for You

Try this:

```java id="br7qxf"
HashTable myTable = new HashTable(13);
```

Use:

```java id="ptmq8v"
return 5 - key % 5;
```

Then insert many colliding values:

```text id="ykpcj9"
13
26
39
52
65
```

Watch how much better the distribution becomes compared to linear probing.
