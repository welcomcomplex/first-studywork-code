package com.lv.studentsimpledemo;


import java.util.*;

public class work1 {

  public static void main(String[] args) {
    ArrayList<student> arr = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    int chose = 0;
    while(chose != 5) {
      System.out.println("----欢迎来到管理系统----");
      System.out.println("1.添加学生");
      System.out.println("2.删除学生");
      System.out.println("3.修改学生");
      System.out.println("4.查询学生");
      System.out.println("5.退出");
      System.out.println("请输入对应选择的数字");
      chose = sc.nextInt();
      switch (chose) {
        case 1:
          addst(arr,sc);
          break;
        case 2:
          rmstu(arr,sc);
          break;
        case 3:
          change(arr,sc);
          break;
        case 4:
          checkst(arr);
          break;
      }

    }
    System.out.println("谢谢您的使用");





  }
  public static boolean chechid(int id,ArrayList<student> stu){

    for (int i = 0; i < stu.size(); i++) {
      student u = stu.get(i);
      if(u.getId() == id){
        return false;
      }
    }
    return true;
  }
  public static void addst(ArrayList<student> stu,Scanner sc ){
    boolean cout = true;
    student st = new student();

    System.out.println("请您输入学生id");
    int id = sc.nextInt();
    cout = chechid(id,stu);
    if(cout) {


      st.setId(id);
      System.out.println("请您输入学生姓名");
      String name = sc.next();
      st.setName(name);
      System.out.println("请您输入学生年龄");
      int age = sc.nextInt();
      st.setAge(age);
      System.out.println("请您输入学生家庭住址");
      String locate = sc.next();
      st.setWhere(locate);
      stu.add(st);
      System.out.println("成功添加");
    }else{
      System.out.println("已经有相同id,输入错误");
    }
  }
  public static void rmstu(ArrayList<student> stu,Scanner sc){

    boolean cout = true;
    System.out.println("请您输入要删除的学生id");
    int id = sc.nextInt();
    cout = chechid(id,stu);
    if(cout ==false){
      for (int i = 0; i < stu.size(); i++) {
        student u = stu.get(i);
        if(u.getId() == id){
          stu.remove(i);
          break;
        }
      }
      System.out.println("删除成功");
    }else{
      System.out.println("id并不存在");
    }
  }
  public static void change(ArrayList<student> stu,Scanner sc){

    boolean cout = true;
    System.out.println("请您输入要修改的学生id");
    int id = sc.nextInt();
    cout = chechid(id,stu);
    if(cout == false){
      for (int i = 0; i < stu.size(); i++) {
        student u = stu.get(i);
        if(id == u.getId()){
          System.out.println("请您输入修改学生姓名");
          String name = sc.next();
          u.setName(name);
          System.out.println("请您输入修改学生年龄");
          int age = sc.nextInt();
          u.setAge(age);
          System.out.println("请您输入修改学生家庭住址");
          String locate = sc.next();
          u.setWhere(locate);

          System.out.println("成功修改");
          break;
        }
      }
    }else{
      System.out.println("不存在id,无法修改");
    }
  }
  public static void checkst(ArrayList<student> stu){
    int count = stu.size();
    if(count != 0){
      System.out.println("id    " + "姓名    " + "年龄     " + "家庭住址" );
      for (int i = 0; i < stu.size(); i++) {
        student iu = stu.get(i);
        System.out.println(iu.toString());
      }
    }
  }
}