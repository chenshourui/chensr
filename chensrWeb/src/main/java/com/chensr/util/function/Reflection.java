package com.chensr.util.function;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;


@SuppressWarnings({"rawtypes","unchecked"})
public class Reflection {
	public static void main(String[] args) throws Exception {
		String str ="package com.chensr.util.function; \r\t"+				    
					"public class Function { \r\t"+
					"    public Function(String a) { \r\t"+
			        "         System.out.println(\"我是构造函数!\"+a);\r\t"+
		            "    }\r\t"+
					"    public static void say(){ \r\t"+
					"        System.out.println(\"我由string生成class\");\r\t"+
					"	}\r\t"+
					"}";
		
		//根据str生成.java文件
		String fileName=System.getProperty("user.dir")+"\\src\\main\\java\\com\\chensr\\util\\function\\Function.java";
		System.out.println(fileName);
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file);
		fw.write(str);
		fw.flush();
		fw.close();
		
		//在Java中javax包提供了JavaCompiler类，此类可以允许开发人员编译java文件为class文件。使用ToolProvider类来获得JavaCompiler接口的一个默认实现。ToolProvider类提供一个getSystemJavaCompiler()方法，返回JavaCompiler接口的一个实例 
		JavaCompiler compiler =ToolProvider.getSystemJavaCompiler();
		//Java 标准文件管理器,第一个参数为监听器，第二个参数语音环境，第三个参数为字符集
		StandardJavaFileManager fileManger = compiler.getStandardFileManager(null, null, null);
		//获取表示给定文件的文件对象
		Iterable unils = fileManger.getJavaFileObjects(fileName);
		//CompilationTask表示编译任务的未来的接口。编译任务尚未启动。启动任务，叫 call方法
		//getTask方法编译java源代码,并将对应的class文件生成到指定目录
//		参数 
//		out -一种从编译器额外产出的作家；如果 null使用 System.err 
//		fileManager -文件管理器；如果 null编译使用标准的文件管理器 
//		diagnosticListener -诊断的倾听者；如果 null使用编译器的默认方法报告诊断 
//		options编译器选项， null意味着没有选择 
//		classes名称的类被标注处理， null意味着没有类名 
//		compilationUnits -编制单位编制， null意味着没有编制单位 

		CompilationTask t = compiler.getTask(null, fileManger, null, null, null, unils);
		t.call();
		fileManger.close();
		
		//load内存，并且创建一个实例
		URL[] urls = new URL[]{new URL("file:/"+System.getProperty("user.dir")+"/scr")};
		
//		这个类装载器用于从目录的搜索路径中加载类和资源，指的是两个文件和目录。结束与“/”的任何一个网址都被假定为指向一个目录
		URLClassLoader cl = new URLClassLoader(urls);
		Class c = cl.loadClass("com.chensr.util.function.Function");	
		//获取构造函数
		Constructor constructor = c.getConstructor(String.class);
		Object b =constructor.newInstance("哈哈");
		
		Method method=c.getDeclaredMethod("say"); 
        method.invoke(b);  
	}
}
