package za.co.MyRobot.toyrobot;

import java.util.Collections;
import java.util.List;

public class ReplayCommand extends Command{
    private int x;
    private int y;

    @Override
    public boolean execute(Robot target) {

        boolean reversed = false;

        List<String> newList = Robot.myHistory(target);


        String args = getArgument();

        if (args.contains("reversed")) {

            reversed = true;

            args = args.replace("reversed", "").trim();
        }

        String [] arg = args.split("[-]");

        if(args.length()==0) {

            if (reversed) {
                Collections.reverse(newList);
            }

            int i;
            for (i = 0; i < newList.size(); i++) {

                target.handleCommand(create(newList.get(i)));
                this.y = target.getPosition().getY();
                this.x = target.getPosition().getX();

                target.getStatus("[" + x + "," + y + "] "
                        + target.getName() + "> " + target.getStatus());
            }
            target.setStatus("replayed " + newList.size() + " commands.");
            if (reversed) {
                Collections.reverse(newList);
            }
        }

        else if(args.length()==1){
            int replyCount = Integer.parseInt(arg[0]);
            List<String> newList2 = newList.subList((newList.size()-replyCount), newList.size());


            if (reversed)
                Collections.reverse(newList2);

            int i;
            for ( i = 0; i < newList2.size(); i++) {

                target.handleCommand(create(newList2.get(i)));

                this.y = target.getPosition().getY();
                this.x = target.getPosition().getX();

                target.getStatus("[" + x + "," + y + "] "
                        + target.getName() + "> " + target.getStatus());
            }
            target.setStatus("replayed " + replyCount + " commands.");
            if (reversed)
                Collections.reverse(newList2);
        }

        else if(arg.length ==2) {

            int n = Integer.parseInt(arg[0]);
            int m = Integer.parseInt(arg[1]);

            List<String> newList2 = newList.subList(newList.size()-n, newList.size()-m);

            if (reversed)
                Collections.reverse(newList2);
            int count = n-m;

            int i;
            for (i = 0; i < newList2.size(); i++) {
                target.handleCommand(create(newList2.get(i)));
                this.y = target.getPosition().getY();
                this.x = target.getPosition().getX();

                target.getStatus("[" + target.getPosition().getX() + "," + target.getPosition().getY() + "] "
                        + target.getName() + "> " + target.getStatus());
            }
            target.setStatus("replayed " + count + " commands.");
            if (reversed)
                Collections.reverse(newList2);
        }else {
            throw new IllegalArgumentException();
        }


        return true;
    }


    public ReplayCommand(String argument) {
        super("replay", argument);
    }

    public ReplayCommand(){
        super("replay");
    }

}



