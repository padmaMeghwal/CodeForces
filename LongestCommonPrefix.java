public class Solution {
	public String longestCommonPrefix(ArrayList<String> a) {
		if(a.size()==0)
		{
			return "";
		}
		String res="";
		for(int i=0;i<a.get(0).length();i++)
		{
			boolean ok = true;
			for(int j=1;j<a.size();j++)
			{
				if(i>=a.get(j).length()||a.get(j).charAt(i)!=a.get(0).charAt(i))
				{
					ok = false;
					break;
				}
			}
			if(!ok)
			{
				break;
			}
			res+=a.get(0).charAt(i);
		}
		return res;
	}
}
