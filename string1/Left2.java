public String left2(String str) {
        String endPart = str.substring(2);
        String frontPart = str.substring(0, 2);
        return endPart + frontPart;
}
