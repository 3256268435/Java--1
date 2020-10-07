# 一、实验内容

  用类描述计算机中的CPU的速度硬盘的容量。
  附加要求：
    (a)类中定义不少于两个构造方法；
    (b)每个类定义不少于2个属性，且属性的类型应该多样化；
    (c)根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
    (d)尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。

# 二、实验方法
  ### 1、先定义要模拟类的属性，比如class CPU中就设置两个属性型号和速度
  ### 2、构造方法，将test中的m值赋给setspeed
  ### 3、调用show()输出结果
  
# 三、核心方法
``` public class Test {
		public static void main(String args[]) {
			CPU cpu=new CPU();
			cpu.setSpeed(2200);
			cpu.setname("i7 9750");
			HardDisk disk=new HardDisk();
			disk.setlx("HDD");
			disk.setAmounr(200);
			PC pc=new PC();
			pc.setCPU(cpu);
			pc.setHardDisk(disk);
			pc.show();
		}
}

```

# 四、实验结果





＃ 五，实验感想
刚开始学的时候对于方法，构造方法一直弄混分不清楚，但通过这次实验，自己有了一些理解，关于方法可以有返回值也可以没有没有返回值，一般用于限定返回值类型和输入输出值。关于构造方法，
首先一定没有返回值，其次方法名与类名一直，一般用于赋值。

