public boolean endOther(String a, String b) {
  int al = a.length();
  int bl = b.length();
  if (al > bl) {
    return a.substring(al - bl) == b;
  }

}
