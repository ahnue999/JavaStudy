public class Ex5
{
	public static void main(String[] args)
	{
		TextEditor editor = new TextEditor();
		TextEditor.Cursor cursor = editor.new Cursor();

		cursor.moveForward(2);
		System.out.println("Current char: " + cursor.getCurrentCharacter());
	}
	public static class TextEditor
	{
		private String content;

		public TextEditor()
		{
			content = "Just a simple sentence here, don't mind me";
		}

		public void displayContent()
		{
			System.out.println(content);
		}

		public class Cursor
		{
			private int position = 0;

			public void moveForward(int steps)
			{
				position += steps;
			}

			public char getCurrentCharacter()
			{
				return (content.charAt(position));
			}
		}
	}
}
