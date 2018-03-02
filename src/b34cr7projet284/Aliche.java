/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b34cr7projet284;

/**
 *
 * @author usager
 */
public class Aliche {
    private String poste;
    private int age;
    private String telephone;

    public Aliche(String poste, int age, String telephone) {
        this.poste = poste;
        this.age = age;
        this.telephone = telephone;
    }

    public String getPoste() {
        return poste;
    }

    public int getAge() {
        return age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Aliche{" + "poste=" + poste + ", age=" + age + ", telephone=" + telephone + '}';
    }
    
}
