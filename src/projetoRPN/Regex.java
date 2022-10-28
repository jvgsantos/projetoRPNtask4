package projetoRPN;
import java.util.regex.*;

public class Regex {
    
	 public static TokenType verificaComRegex(String expressao) {
		 
		 Pattern pattern = Pattern.compile("+");
		 Matcher matcher = pattern.matcher(expressao);
		 boolean encontrado = matcher.find();
		
		 if(encontrado) {
		     return TokenType.PLUS;
		 } 
		 
		 pattern = Pattern.compile("-");
		 matcher = pattern.matcher(expressao);
		 encontrado = matcher.find();
		 if(encontrado) {
		     return TokenType.MINUS;
		 } 
		 
		 pattern = Pattern.compile("*");
		 matcher = pattern.matcher(expressao);
		 encontrado = matcher.find();
		 if(encontrado) {
		     return TokenType.STAR;
		 } 
		 
		 pattern = Pattern.compile("/");
		 matcher = pattern.matcher(expressao);
		 encontrado = matcher.find();
		 if(encontrado) {
		     return TokenType.SLASH;
		 } 
		 
		 return null;
	 }

}
