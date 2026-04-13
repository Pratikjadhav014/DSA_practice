class FriendPairing{

    public static int friendPairing(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }

        return friendPairing(n-1)+friendPairing(n-1)*friendPairing(n-2);
    }
    public static void main(String[] args) {
        
        int x = friendPairing(4);
        System.out.println(x);

    }
} 