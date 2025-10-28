package OctoberTwentyEight;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
        setList(list);
	}

	public void setList(String list)
	{
        queue = new LinkedList<String>();
        stack = new Stack<String>();

        String[] words = list.split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                queue.add(word);
                stack.push(word);
            }
        }
	}

	public boolean isPalin()
	{
        Queue<String> tempQ = new LinkedList<>(queue);
        Stack<String> tempS = (Stack<String>) stack.clone();
        while (!tempQ.isEmpty() && !tempS.isEmpty()) {
            if (!tempQ.remove().equals(tempS.pop())) {
                return false;
            }
        }
        return true;
	}

    public String toString() {
        return queue.toString();
    }


	//write a toString method
}
