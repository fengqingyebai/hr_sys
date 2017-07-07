package com.link.action;


import com.link.entity.Dept;
import com.link.entity.Employee;
import com.link.service.IDeptService;
import com.link.service.IEmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.interceptor.RequestAware;

import java.util.List;
import java.util.Map;

/**
 * 员工模块控制器开发：
 * 1. 员工列表展示
 * 2. 添加员工
 * 3. 修改员工信息
 * 5. 删除
 * @author link
 * @create 2017-04-01-14:23
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>,RequestAware{
    /*******一、封装数据********/
    private Employee employee=new Employee();// 【模型驱动】

    // 封装请求的部门id(下拉列表的实际的值)
    private int deptId;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Override
    public Employee getModel() {
        return employee;  // 返回实例化后的对象
    }


    /*******二、注入员工Service********/
    private IEmployeeService employeeService;

    public void setEmployeeService(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    /*******二、注入部门Service********/
    private IDeptService deptService;

    public void setDeptService(IDeptService deptService) {
        this.deptService = deptService;
    }

    /**
     * 1 员工列表展示
     * @return
     */
    public String list(){
        //获取所有的员工信息
        List<Employee> listEmp = employeeService.getAll();
        //存入request域中
        request.put("listEmp",listEmp);

        return "list";
    }

    /**
     * 2 添加员工 进行添加界面
     *
     */
   public String viewAdd(){

       //查询所有部门信息 保存的request中
       List<Dept> listDept = deptService.getAll();
       request.put("listDept",listDept);

        return "add";
   }


    /**
     * 2 添加员工 添加员工数据
     */
  public String save(){
        //先根据部门id 获取部门
      Dept dept = deptService.findById(deptId);
      //设置到员工对象中
      employee.setDept(dept);
      //保存员工对象
      employeeService.save(employee);

      return "listAction";//重定向 到Action
  }

    /**
     * 3 修改员工视图  修改员工信息
     * @return
     */
    public  String viewUpdate(){

        int id = employee.getId();
        // 1. 根据员工的主键查询  (lazy="false")
        Employee emp = employeeService.findById(id);
        // 2. 查询所有的部门
        List<Dept> listDept = deptService.getAll();
        // 数据回显
        ValueStack vs = ActionContext.getContext().getValueStack();
        vs.pop(); //移除栈顶元素
        vs.push(emp);//入栈
        //保存
        request.put("listDept",listDept);

        return "edit";

    }

    /**
     * 4 修改员工信息  确认修改
     * @return
     */
    public String update(){
        //根据部门id获取部门
        Dept dept = deptService.findById(deptId);
        //设置到员工对象中
        employee.setDept(dept);
        //更新员工
        employeeService.update(employee);

        //重定向
        return "listAction";

    }


    /**
     * 5 修改员工信息 删除
     * @return
     */
    public String delete(){
        //获取待删除员工的主键
        int empId = employee.getId();
        //调用service 删除员工
        employeeService.delete(empId);

        return "listAction";
    }


    // 接收框架运行时候传入的代表request对象的map
    private Map<String,Object> request;
    @Override
    public void setRequest(Map<String, Object> request) {
            this.request=request;
    }
}
