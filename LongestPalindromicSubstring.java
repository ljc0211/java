class Solution {
	
    public String longestPalindrome(String s)
    {
        if (s.length() < 1)
            return s;
        else
        {
            int[][] dp = new int[s.length()][s.length()];
            char[] _s = new char[s.length()];
            String Substring = new String(s.substring(0, 1));
            int Length = 1;	//Length of Longest Palindromic Substring.

            for(int i = 0; i < s.length(); i++)
            {
                _s[i] = s.charAt(i);	//Used to be compared.
            }

            for(int i = 0; i < s.length(); i++)
            {
                dp[i][i] = 1;	//A word must be a palindromic.
                if (i < s.length() - 1)
                {
                    if(_s[i] == _s[i+1])
                    {
                        dp[i][i+1] = 1;
                        Substring = s.substring(i, i + 2);
                        Length = 2;
                    }
                }
            }

            for (int L = 3; L < s.length() + 1; L++)
            {
                for (int i = 0; i < s.length() - L + 1; i++)
                {
                    int j = i + L -1;	//Right Board of Substring.
                    if ((_s[i] == _s[j]) && (dp[i+1][j-1] == 1))
                    {
                        dp[i][j] = 1;
                        Substring = s.substring(i, i + L);
                        Length = L;	//L add 1 each time.
                    }
                }
            }

            return Substring;
        }
    }
}
