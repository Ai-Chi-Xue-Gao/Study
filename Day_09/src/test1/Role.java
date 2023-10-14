package test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;//长相是随机的

    String[] boyFaces = {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlFaces = {"美轮美奂","沉鱼落雁","亭亭玉立","身材姣好","相貌平平","相貌简陋","惨不忍睹"};

    public Role() {
    }

    public Role(String name, int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
        setFace(gender);
    }

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        //长相是随机的
        if (gender == '男'){
            //从boyFaces里面随机长相
            int index = r.nextInt(boyFaces.length);
            this.face = boyFaces[index];
        } else if (gender == '女') {
            //从girlFaces里面随机长相
            int index = r.nextInt(girlFaces.length);
            this.face = girlFaces[index];
        }else {
            this.face = "面目狰狞";
        }
    }

    //定义一个方法用于攻击别人
    //思考：谁攻击谁？
    //Role r1 = new Role();
    //Role r2 = new ROle();
    //r1.攻击(r2);
    //方法的调用者去攻击参数
    public void attack(Role role){
        //计算造成的伤害1~220
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //剩余血量
        int remainBoold = role.getBlood() - hurt;
        //对剩余血量做一个验证，如果为负数了，就修改为0
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        //修改一下挨揍的人的血量
        role.setBlood(remainBoold);

        //this表示方法的调用者
        System.out.println(this.getName()+"举起拳头，打了"+role.getName()+"一下，"+
                "造成了"+hurt+"点伤害，"+role.getName()+"还剩下了"+remainBoold+"点血");
    }

    public void showRoleInfo(){
        System.out.println("姓名为："+getName());
        System.out.println("血量为："+getBlood());
        System.out.println("性别为："+getGender());
        System.out.println("长相为："+getFace());
    }
}