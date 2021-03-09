package mytest;

import java.util.Collection;

import com.github.jbaiter.kenlm.Model;
import com.github.jbaiter.kenlm.ModelException;

public class loadModel {
    public static void main(String[] args) {

            try {
				
            	Model model = new Model("/home/hironeo/Desktop/kenlm_jbaiter/kenlm-java/src/test/resources/test.arpa");
            	System.out.println("load done");
            	double scores = model.score("looking a little beyond");
            	System.out.println(scores);
            } catch (ModelException e) {
				System.out.println("cannot load language model");
				e.printStackTrace();
			}
       

    }
}
