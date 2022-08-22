package cn.kgc.bean;


public class EnterPriseTalent {

  private long id;
  private String name;
  private long workingLife;
  private String workExperience;
  private String personalProfile;
  private long departmentId;
  private String graduateSchool;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getWorkingLife() {
    return workingLife;
  }

  public void setWorkingLife(long workingLife) {
    this.workingLife = workingLife;
  }


  public String getWorkExperience() {
    return workExperience;
  }

  public void setWorkExperience(String workExperience) {
    this.workExperience = workExperience;
  }


  public String getPersonalProfile() {
    return personalProfile;
  }

  public void setPersonalProfile(String personalProfile) {
    this.personalProfile = personalProfile;
  }


  public long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(long departmentId) {
    this.departmentId = departmentId;
  }


  public String getGraduateSchool() {
    return graduateSchool;
  }

  public void setGraduateSchool(String graduateSchool) {
    this.graduateSchool = graduateSchool;
  }

}
