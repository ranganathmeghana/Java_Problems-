package Chapter2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		Map<String, Node> nodeMap = new HashMap<String, Node>();

		String line = null;
		List<String> wordList = new ArrayList<String>();

		List<Node> maxNodes = new ArrayList<Node>();

		FibonacciHeapClass heapObject = new FibonacciHeapClass();

		InputStream ip = new FileInputStream("sample_input1.txt");
		InputStreamReader isr = new InputStreamReader(ip, Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(isr);

		while ((line = br.readLine()) != null) {

			String str[] = line.split(" ");
			if (str.length > 1) {
				str[0] = str[0].substring(str[0].indexOf("#") + 1);

				// wordList.add(line);
				Node node = new Node();
				node.setValue(Integer.parseInt(str[1]));
				node.setChild(null);
				node.setParent(null);
				//node.setRightSibling(null);
				//node.setLeftSibling(null);
				Node existingNode = nodeMap.get(str[0]);
				if (existingNode == null) {
					nodeMap.put(str[0], node);
					heapObject.insertToHeap(node, node.getValue());

				} else {

					heapObject.increaseKey(existingNode, Integer.parseInt(str[1]));
				}

			} else {
				if (str[0].equals("STOP")) {
					break;
				}
				int numberOfRemoveMax = Integer.parseInt(str[0]);

				for (int i = 0; i < numberOfRemoveMax; i++) {

					Node node = heapObject.removeMax();

					maxNodes.add(node);

				}

			}

			for(int i=0;i<maxNodes.size();i++){
				
			}
			System.out.println(nodeMap);
		}

		for (String word : wordList) {

			System.out.println(word.substring(word.indexOf("#"), word.length()));
		}
	}

}
