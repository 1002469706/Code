package client;

import abstraction.*;
import implementation.*;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// ����Linux�ļ�Ŀ¼��һ��
		File root = new Folder("root");
		File users = new Folder("user");
		File bin = new Folder("bin");
		// ����userĿ¼���û�Ŀ¼
		File user1 = new Folder("user1");
		File user2 = new Folder("user2");
		// ����һЩͼƬ�ļ�
		File image1 = new Image("image1");
		File image2 = new Image("image2");
		// ����һЩ�ı��ļ�
		File txt1 = new Txt("txt1");
		File txt2 = new Txt("txt2");

		root.add(users);
		root.add(bin);

		users.add(user1);
		users.add(user2);

		bin.add(txt1);

		user1.add(image1);
		user1.add(txt2);

		user2.add(image2);

		root.showSelf(0);
	}

}
