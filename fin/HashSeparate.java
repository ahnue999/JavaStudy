public class HashSeparate
{
    public static void main(String[] args)
    {
        HashTable myTable = new HashTable(10);
        
        myTable.insert(6);
        myTable.insert(37);
        System.out.println("37: " + myTable.find(37));
    }
    public static class Node
    {
        private int key;
        public Node next;
        
        public Node(int n)
        {
            key = n;
            next = null;
        }
         public int getKey()
         {
             return key;
         }
    }
    public static class List
    {
        Node head;
        
        public void insert(int n)
        {
            Node tmp = new Node(n);
            Node curr = head;
            Node prev = null;
            
            
            while (curr != null && n > curr.getKey())
            {
                prev = curr;
                curr = curr.next;
            }
            
            if (prev == null)
            {
                head = tmp;
            }
            else
            {
                prev.next = tmp;
                tmp.next = curr;
            }
        }
        public Node find(int key)
        {
            Node curr = head;
            
            while (curr != null && curr.getKey() != key)
            {
                curr = curr.next;
            }
            
            return curr;
        }
    }
    public static class HashTable
    {
        private int maxSize;
        private List[] hashArray;
        
        public HashTable(int size)
        {
            maxSize = size;
            hashArray = new List[maxSize];
            
            for (int i = 0; i < maxSize; i++)
            {
                hashArray[i] = new List();
            }
        }
        public int hashFunc(int key)
        {
            return (key % maxSize);
        }
        
        public void insert(int n)
        {
            int hashVal = hashFunc(n);
            hashArray[hashVal].insert(n);
        }
        public Node find(int key)
        {
            int hashVal = hashFunc(key);
            return hashArray[hashVal].find(key);
        }
    }
}