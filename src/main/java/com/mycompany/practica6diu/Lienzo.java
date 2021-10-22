/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica6diu;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author hugob
 */
public class Lienzo extends JPanel{
    
    BufferedImage imagen = null;
    
    public Lienzo() throws IOException {
        
        System.out.println("LIENZO BUILD");
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        
        g.drawImage(imagen, 0, 0, null);
        System.out.println("LIENZO DRAW");
    }
    
    public void setImagen(String path) throws IOException{
        imagen = ImageIO.read(new File(path));
    }
    
   public void setImagen(BufferedImage i){
       imagen = i;
   }
    
}
