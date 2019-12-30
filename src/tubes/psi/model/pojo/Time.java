/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.psi.model.pojo;

/**
 *
 * @author A412FL
 */
public class Time {
    private int second;
    private int minute;
    private int hour;
    
    public Time(){
        
    }
    
    public Time(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    public int getSecond() {
        return second;
    }

    public void setNrp(int second) {
        this.second = second;
    }
    
    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
    
}
