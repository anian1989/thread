package SE;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class JavaProperties {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-22 ����5:11:57
	 * @param args
	 */
	public static void main(String[] args) {

		Properties p = System.getProperties();

		System.out.println("Java ����ʱ�����汾: "+p.getProperty("java.version"));
		System.out.println("Java ����ʱ������Ӧ��: "+p.getProperty("java.vendor"));
		System.out.println("Java ��Ӧ�̵� URL: "+p.getProperty("java.vendor.url"));
		System.out.println("Java �İ�װ·��: "+p.getProperty("java.home"));
		System.out.println("Java ������淶�汾: "+p.getProperty("java.vm.specification.version"));
		System.out.println("Java ������淶��Ӧ��: "+p.getProperty("java.vm.specification.vendor"));
		System.out.println("Java ������淶����: "+p.getProperty("java.vm.specification.name"));
		System.out.println("Java �����ʵ�ְ汾: "+p.getProperty("java.vm.version"));
		System.out.println("Java �����ʵ�ֹ�Ӧ��: "+p.getProperty("java.vm.vendor"));
		System.out.println("Java �����ʵ������: "+p.getProperty("java.vm.name"));
		System.out.println("Java ����ʱ�����淶�汾: "+p.getProperty("java.specification.version"));
		System.out.println("Java ����ʱ�����淶��Ӧ��: "+p.getProperty("java.specification.vendor"));
		System.out.println("Java ����ʱ�����淶����: "+p.getProperty("java.specification.name"));
		System.out.println("��ǰ��ĸ�ʽ�汾��: "+p.getProperty("java.class.version"));
		System.out.println("��ǰ�����ڵ�·��: "+p.getProperty("java.class.path"));
		System.out.println("���ؿ�ʱ������·���б�: "+p.getProperty("java.library.path"));
		System.out.println("Ĭ�ϵ���ʱ�ļ�·��: "+p.getProperty("java.io.tmpdir"));
		System.out.println("Ҫʹ�õ� JIT ������������: "+p.getProperty("java.compiler"));
		System.out.println("һ��������չĿ¼��·��: "+p.getProperty("java.ext.dirs"));
		System.out.println("����ϵͳ������: "+p.getProperty("os.name"));
		System.out.println("����ϵͳ�ļܹ�: "+p.getProperty("os.arch"));
		System.out.println("����ϵͳ�İ汾: "+p.getProperty("os.version"));
		System.out.println("��ǰ����ϵͳ���ļ��ָ���: "+p.getProperty("file.separator"));
		System.out.println("��ǰ����ϵͳ��·���ָ���: "+p.getProperty("path.separator"));
		System.out.println("��ǰ����ϵͳ���зָ���: "+p.getProperty("line.separator"));
		
		System.out.println("�û��ĵ�ǰ�˻�����: "+p.getProperty("user.name"));
		System.out.println("�û��ĵ�ǰ����Ŀ¼: "+p.getProperty("user.dir"));
		System.out.println("�û�����Ŀ¼: "+p.getProperty("user.home"));
		
		
		Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();
        for(Object obj : keySet){
            System.out.println("System Property: {"+obj.toString()+","+System.getProperty(obj.toString())+"}");
        }
		
	}

}