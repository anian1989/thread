package chapter;

import java.io.File;

/**
 * <p>
 * Description:���ǽ�ʵ�ֵ��̻߳���ݸ������������ļ��������ļ���������ļ��������չʾ���ʹ��InterruptedException�쳣�������̵߳��жϡ�
 * </p>
 * 
 * @author zhangjunshuai
 * @version 1.0 Create Date: 2014-8-11 ����3:10:29 Project Name: Java7Thread
 * 
 *          <pre>
 * Modification History: 
 *             Date                                Author                   Version          Description 
 * -----------------------------------------------------------------------------------------------------------  
 * LastChange: $Date::             $      $Author: $          $Rev: $
 * </pre>
 * 
 */
public class FileSearch implements Runnable {
	private String initPath;
	private String fileName;

	public FileSearch(String initPath, String fileName) {
		this.fileName = fileName;
		this.initPath = initPath;
	}

	@Override
	public void run() {

		File file = new File(initPath);
		if (file.isDirectory()) {
			try {
				directoryProcess(file);
			} catch (InterruptedException e) {
				System.out.printf("%s:The search has been interrupted", Thread
						.currentThread().getName());
			}
		}
	}

	private void directoryProcess(File file) throws InterruptedException {
		File list[] = file.listFiles();
		if (list != null) {
			for (int i = 0; i < list.length; i++) {
				if (list[i].isDirectory()) {
					directoryProcess(list[i]);
				} else {
					fileProcess(list[i]);
				}
			}
		}
		if (Thread.interrupted()) {
			throw new InterruptedException();
		}
	}

	private void fileProcess(File file) throws InterruptedException {
		if (file.getName().equals(fileName)) {
			System.out.printf("%s : %s\n", Thread.currentThread().getName(),
					file.getAbsolutePath());
		}
		if(Thread.interrupted()){
			throw new InterruptedException();
		}
	}

}
