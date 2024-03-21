package org.example;
    class Dna {
        public static String dnaComplement(String dna) {
            StringBuilder sb = new StringBuilder();
            for (char nucleotide : dna.toCharArray())
                if (nucleotide == 'T') {
                    sb.append('A');
                } else if (nucleotide == 'C') {
                    sb.append('G');
                } else if (nucleotide == 'A') {
                    sb.append('T');
                } else if (nucleotide == 'G') {
                    sb.append('C');
                } else {
                    return null;
                }
            return sb.toString();
        }

        public static void main(String[] args) {
            String str = "T";
            String str2 = "C";
            String str3 = "A";
            String str4 = "G";
            System.out.println(dnaComplement(str));
            System.out.println(dnaComplement(str2));
            System.out.println(dnaComplement(str3));
            System.out.println(dnaComplement(str4));

        }
    }

