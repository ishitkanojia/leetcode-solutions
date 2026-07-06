class Solution {
    public String validIPAddress(String queryIP) {
        String[] parts = queryIP.split("\\.", -1);
        if (parts.length == 4) {
            boolean ipv4 = true;
            for (String part : parts) {
                if(part.length() == 0 || part.length()>3){ ipv4 = false; break;}
                if(part.length() > 1 && part.charAt(0) == '0') ipv4 = false;
                for (char ch : part.toCharArray()) {
                    if (!Character.isDigit(ch)) ipv4 = false;
                }
                if(!ipv4) break;
                int num = Integer.parseInt(part);
                if(num < 0 || num > 255) ipv4 = false;
            }
            if(ipv4) return "IPv4";
        }
        parts=queryIP.split(":",-1);
        if (parts.length == 8) {
            boolean ipv6 = true;
            for (String part : parts) {
                if (part.length() < 1 || part.length() > 4) ipv6 = false;
                for (char ch : part.toCharArray()) {
                    if (!(Character.isDigit(ch)||(ch>='a'&&ch<='f')||(ch>='A'&&ch<='F'))) ipv6=false;
                }
            }
            if(ipv6) return "IPv6";
        }
        return "Neither";
    }
}