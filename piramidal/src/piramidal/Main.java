package piramidal;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Nodo n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, n22, n23, n24, n25, n26, n27, n28, n29, n30, n31, n32, n33, n34, n35, n36, n37, n38, n39;
		Nodo n40, n41, n42, n43, n44, n45, n46, n47, n48, n49, n50, n51, n52, n53, n54, n55, n56, n57, n58, n59, n60, n61, n62, n63, n64, n65, n66, n67, n68, n69;
		Nodo n70, n71, n72, n73, n74, n75, n76, n77, n78, n79, n80, n81;
		
		n3 = new Nodo("n3", 5);
		n4 = new Nodo("n4", 4);
		n81 = new Nodo("n81", n3, n4, new Nodo(), new Nodo());
		n2 = new Nodo("n2", 3);
		n1 = new Nodo("n1", 4);
		n7 = new Nodo("n7", n1, n2, n81);		
		n5 = new Nodo("n4", 4);
		n6 = new Nodo("n6", 4);
		n8 = new Nodo("n8", 4);
		n9 = new Nodo("n9", 4);
		n10 = new Nodo("n10", 3);
		n11 = new Nodo("n11", 5);
		n12 = new Nodo("n12", 4);
		n13 = new Nodo("n13", 5);
		n14 = new Nodo("n14", n10, n11, n12, n13);
		n15 = new Nodo("n15", 5);
		n16 = new Nodo("n16", 4);
		n17 = new Nodo("n17", n15, n16);
		n18 = new Nodo("n18", n8, n9, n14, n17);
		n19 = new Nodo("n19", 4);
		n20 = new Nodo("n20", n19, new Nodo(), new Nodo(), new Nodo());
		n21 = new Nodo("n21", n18, n20, new Nodo(), new Nodo(), new Nodo());
		n22 = new Nodo("n22", n6, n7, n21);
		
		n23 = new Nodo("n23", 4);
		n24 = new Nodo("n24", 5);
		n25 = new Nodo("n25", 5);
		n26 = new Nodo("n26", n23, n24, n25);
		n27 = new Nodo("n27", 3);
		n28 = new Nodo("n28", n27, new Nodo(), new Nodo(), new Nodo(), new Nodo(), new Nodo());
		n29 = new Nodo("n29", 3);
		n30 = new Nodo("n30", n28, n29, n26);
		n31 = new Nodo("n31", n30, new Nodo(), new Nodo());
		
		n32 = new Nodo("n32", 4);
		n33 = new Nodo("n33", 5);
		n34 = new Nodo("n34", n22, n32, n33);
		
		n35 = new Nodo("n35", 4);
		n36 = new Nodo("n36", 2);
		n37 = new Nodo("n37", n35, n36);
		n38 = new Nodo("n38", 5);
		n39 = new Nodo("n39", 4);
		n40 = new Nodo("n40", 4);
		n41 = new Nodo("n41", 3);
		n42 = new Nodo("n42", n37, n38, n39);
		n43 = new Nodo("n43", 3);
		n44 = new Nodo("n44", 2);
		n45 = new Nodo("n45", n40, n41, n42, n43, n44);
		n46 = new Nodo("n46", 3);
		n47 = new Nodo("n47", 5);
		n48 = new Nodo("n48", 4);
		n49 = new Nodo("n49", n47, n48, new Nodo(), new Nodo(), new Nodo(), new Nodo());
		n50 = new Nodo("n50", 4);
		n51 = new Nodo("n51", n46, n49, n50);
		n52 = new Nodo("n52", 4);
		n53 = new Nodo("n53", n52, new Nodo(), new Nodo(), new Nodo());
		n54 = new Nodo("n54", n53, new Nodo(), new Nodo(), new Nodo());
		
		n55 = new Nodo("n55", 5);
		n56 = new Nodo("n56", 3);
		n57 = new Nodo("n57", 4);
		n58 = new Nodo("n58", 4);
		n59 = new Nodo("n59", n55, n56, n57, n58);
		n60 = new Nodo("n60", 3);
		n61 = new Nodo("n61", n60, n59);
		n62 = new Nodo("n62", 3);
		n63 = new Nodo("n63", 3);
		n64 = new Nodo("n64", n62, n63);
		n65 = new Nodo("n65", 3);
		n66 = new Nodo("n66", 4);
		n67 = new Nodo("n67", n64, n65, n66);
		n68 = new Nodo("n68", 4);
		n69 = new Nodo("n69", 4);
		n70 = new Nodo("n70", 3);
		n71 = new Nodo("n71", 4);
		n72 = new Nodo("n72", 3);
		n73 = new Nodo("n73", n69, n70, n71, n72);
		n74 = new Nodo("n74", 3);
		n75 = new Nodo("n75", 3);
		n76 = new Nodo("n76", n61, n67, n68, n73, n74);
		n77 = new Nodo("n77", 5);
		n78 = new Nodo("n78", 4);
		n79 = new Nodo("n79", n78, n77, n76);
		n80 = new Nodo("n80", n31, n34, n45, n51, n54, n79);
		
		Nodo padre = n80;

		padre.generaDineroPagado();
		padre.calculaComisiones();
		padre.printNodo();
		
	}

}
