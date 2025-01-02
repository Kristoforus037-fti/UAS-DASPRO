/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author LENOVO
 */
public class ACKamar implements InterfaceAC {
 int statusACKamar;
 public void hidupkan(){
if (statusACKamar == KEADAAN_MATI){
statusACKamar = KEADAAN_HIDUP;
System.out.println("Hidupkan AC! --> AC Hidup");
}else{
System.out.println("Hidupkan AC! --> AC Sudah Hidup Kok");}
}
 public void matikan(){
if (statusACKamar == KEADAAN_HIDUP){
statusACKamar = KEADAAN_MATI;
System.out.println("Matikan AC! --> AC Mati");
}else{
System.out.println("Matikan AC! --> AC Sudah Mati Kok");
}
}
}
