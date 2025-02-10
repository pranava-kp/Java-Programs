        while(completed<=packets)
        {
            if((count+1)%err==0)
            {
                int temp=0;
                while(temp++<n)
                {
                    seq+=(Integer.toString(completed+temp))+",";
                    System.out.println("new"+seq);
                    count=(count++)%n;
                }
                completed+=n;
            }
            else
            {
                
            }
            
        }
        System.out.println(seq);