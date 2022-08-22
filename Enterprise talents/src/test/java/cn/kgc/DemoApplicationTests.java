package cn.kgc;

import cn.kgc.bean.Department;
import cn.kgc.bean.EnterPriseTalent;
import cn.kgc.mapper.DepartmentMapper;
import cn.kgc.mapper.EnterPriseTalentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private EnterPriseTalentMapper enterPriseTalentMapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void getAllTalentInfo(){
        List<EnterPriseTalent> allTalentInfo = enterPriseTalentMapper.getAllTalentInfo();
        for(EnterPriseTalent enterPriseTalent:allTalentInfo){
            System.out.println("人才姓名 :"+enterPriseTalent.getName()+",工作年限: "+enterPriseTalent.getWorkingLife());
        }
    }
    @Test
    public void getDepartNameInfo(){
        List<Department> departNameInfo = departmentMapper.getDepartNameInfo();
        for(Department department:departNameInfo){
            System.out.println("部门名称："+department.getName());
        }
    }

    @Test
    public void getDepartName(){
        List<EnterPriseTalent> name = enterPriseTalentMapper.getAllTalentName("项目测试部门");
        for(EnterPriseTalent enterPriseTalent:name){
            System.out.println("人才姓名 :"+enterPriseTalent.getName()+",工作年限: "+enterPriseTalent.getWorkingLife());
        }
    }
    @Test
    public void getAllTalent(){
        List<EnterPriseTalent> allTalentInfo = enterPriseTalentMapper.getAllTalent(1);
        for(EnterPriseTalent enterPriseTalent:allTalentInfo){
            System.out.println("人才姓名 :"+enterPriseTalent.getName()+",工作年限: "+enterPriseTalent.getWorkingLife());
        }
    }
    @Test
    public void getInsertTalent(){
        EnterPriseTalent enterPriseTalent = new EnterPriseTalent();
        enterPriseTalent.setName("施登上");//姓名
        enterPriseTalent.setWorkingLife(1);//工作年限
        enterPriseTalent.setWorkExperience("曾经在某鹏鼎电子厂干了数月，现在在公安局里当混子，天天无所事事");//工作经历
        enterPriseTalent.setPersonalProfile("本人180来斤，目前在派出所里当所长，平时在派出所里面吹吹牛逼，到家喝喝小酒，没事干出去打打篮球");//个人简介
        enterPriseTalent.setDepartmentId(3);//所在部门
        enterPriseTalent.setGraduateSchool("江苏职业技术学校");//毕业学校
        int i = enterPriseTalentMapper.InsertTalent(enterPriseTalent);
        if(i>0){
            System.out.println("添加成功！");
        }

    }

    @Test
    public void updateTalent(){
        EnterPriseTalent enterPriseTalent = new EnterPriseTalent();
        enterPriseTalent.setId(1);//id
        enterPriseTalent.setName("张三");//姓名
        enterPriseTalent.setWorkingLife(20);//工作年限
        enterPriseTalent.setWorkExperience("不详");//工作经历
        enterPriseTalent.setPersonalProfile("不详");//个人简介
        enterPriseTalent.setDepartmentId(1);//所在部门
        enterPriseTalent.setGraduateSchool("江苏");//毕业学校
        int i = enterPriseTalentMapper.updateTalent(enterPriseTalent);
        System.out.println(i+"===========");
    }

    @Test
    public void deleteTalent(){
        int i = enterPriseTalentMapper.deleteTalent(10);
        if(i>0){
            System.out.println("删除成功！");
        }

    }

}
