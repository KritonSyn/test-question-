
public class Questions {
	String[][] answers={
	        {"Καλυψώ "," Κίρκη"," Αφροδίτη " }, 
	        { " Ήφαιστος ", " Άρης "," Ποσειδώνας " },
	        { "'Ηλιος",  "Ποσειδώνας"," Δίας" }, 
	        {" Φήμιος "," Δημόδοκος", "Αντίνοος"}, 
	        {"τον Κέρβερο"," τον Κένταυρο", " τον Ερύμανθο "},
	        {"  Αιγέας "," Αγαμέμνων", "Δαίδαλος"},
	        {"Πρωτεσίλαος"," Φιλοκτήτης", "Τεύκρος" } ,
	        {"Ισμήνη ","Ιοκάστη ",  "Ελένη "}, 
	        {"Βρισηίδα " ," Χρυσηίδα" , "Ανδρομάχη" }, 
	        {" ΄Ατλας", "Προμηθέας ", "Επιμηθάες" } , 
	        { "Στην Κνωσσό" , "Στην Τροία", "Στον Εύρωμο" },
	        {" Σε εννέα" ,"Σε πέντε" , "Σε δύο" }, 
	        {"1250-1240 π.Χ ","1500-1490 π.Χ " , "1100-1090 π.Χ" }, 
	        {"Στον Ευριτίωνα και τον Όρθρο" ,"Στον Μενοίτιο και τον Άδη" }, 
	        {" Η θεά Ήρα" ,"Η θεά Δήμητρα" , "Η θεά Αφροδίτη" }, 
	        {"Για να πάρουν το χρυσόμαλλο δέρας" ," Για να φέρουν εις πέρας τρεις άθλους ", "Ήταν διαταγή του Πελία" },
	        {" Είχε κεφάλι λιονταριού, ουρά φιδιού και σώμα κατσίκας","Είχε κεφάλι φιδιού, ουρά σκύλου και σώμα κατσίκας " , "Είχε κεφάλι ταύρου, ουρά λιονταριού και σώμα κατσίκας" },
	        {"Στο Ιδαιό Άντρο " ,"Στη Φαιστό " , "Στην Τροία " },
	        {"Η τρίαινα" ," Τα φίδια" ,"Τα σπαθιά "}, 
	        {"Ο Οδυσσέας","Ο Θησέας", "Ο Ιάσονας"  }
	        
	             };
	 int[] ca = { 1, 1, 0, 2, 1, 2, 2, 1, 0, 2, 0, 0, 1, 0, 0, 1, 2, 0, 1, 2
			  };
	
	  String[] qs = { "Στο νησί ποιας θεάς φιλοξενήθηκε ο Οδυσσέας για επτά χρόνια καθώς προσπαθούσε να επιστρέψει στην Ιθάκη;" ,
			  "Ποιος θεός φιλοτέχνησε την ασπίδα του Αχιλλέα; ", 
			  "Ποιος θεός οργίστηκε με τον Οδυσσέα και τους συντρόφους του, επειδή του έφαγαν τα ιερά του βόδια;",
			  "Πώς λεγόταν ο αοιδός του παλατιού του Οδυσσέα στην Ιθάκη;",
			  "Ποιο σκυλί ζήτησε ο Ευρυσθέας από τον Ηρακλή να του φέρει από τον Κάτω Κόσμο;",
			  "Πώς λεγόταν ο πατέρας  του Θησέα;","Πώς λεγόταν ο πρώτος Αχαιός πολεμιστής που σκοτώθηκε στην Τροία;",
			  "Ποια ήταν η αδερφή της Αντιγόνης;", "Πώς λεγόταν η σκλάβα του Αχιλλέα την οποία απαίτησε ο Αγαμέμνων να του την πάρει;",
			  "Ποιος ήταν ο Τιτάνας που τιμωρήθηκε από το Δία να φέρει αιώνια στους ώμους του τον ουράνιο θόλο;",
			  "Που ήταν κτισμένο το παλάτι του βασιλιά Μίνωα;","Σε πόσους συνολικά άθλους διακρίθηκε ο Θησέας;",
			  "Σύμφωνα με τον Ηρόδοτο, πότε έγινε ο Τρωικός Πόλεμος;",
			  "Σε ποιους είχε αναθέσει τη φύλαξη των ζώων του ο Γηρυόνης, ο άνθρωπος με τα τρία σώματα;",
			  "Ποια ήταν η βασίλισσα των θεών και των ανθρώπων;","Για ποιον λόγο οργανώθηκε από τον Ιάσονα η Αργοναυτική εκστρατεία",
			  "Πώς έμοιαζε στην όψη μία Χίμαιρα;","Σε ποιο μέρος έκρυψε η Ρέα, τον γιό της Δία προκειμένου να γλιτώσει από τον Κρόνο που έτρωγε τα παιδιά του;",
			  "Ποιο είναι το σύμβολο του θεού Ποσειδώνα ;", "Ποιος ήρθε «αντιμέτωπος» με τις Σειρήνες;"
			   };
	  
	    public void startQuestions(int n){
	      Question_check questions = new Question_check(qs[n],answers[n],ca[n],this);
	      questions.playq();  
	        
	       
	    
	    }
}
