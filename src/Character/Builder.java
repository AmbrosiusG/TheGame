package Character;
import Map.player;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guest-7gls9j
 */
public class Builder extends Character{
    // Builder Eigenschaften überdenken, wie soll es funktionieren, Cooldown/Speed/Charges
    int buildcooldown;

    public Builder(String playername) {
        super(playername);
    }
    

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
