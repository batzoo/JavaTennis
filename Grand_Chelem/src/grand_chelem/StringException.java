/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

/**
 *
 * @author ISEN
 */
public class StringException extends Exception {
    StringException(String message){
        super(message);
    }
    @Override
    public String getMessage(){
        return "!! Entrée invalide !!"+super.getMessage()+"!!!";
    }
}
