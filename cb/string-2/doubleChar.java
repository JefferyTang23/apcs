public String doubleChar(String str) {
  String dc = "";
  for (int i = 0 ; i < str.length() ; i++) {
    dc += str.substring(i, i + 1) + str.substring(i, i + 1);
  }
  return dc;
}
