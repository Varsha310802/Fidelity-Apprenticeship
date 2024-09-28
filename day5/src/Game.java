public class Game {
        public String name;
        public int MaxNumPlayers;
        public Game(String name, int MaxNumPlayers) {
            this.name = name;
            this.MaxNumPlayers = MaxNumPlayers;
        }
        public String GetName() {
            return name;
        }
        public int GetMaxNumPlayers() {
            return MaxNumPlayers;
        }
        @Override
        public String toString() {
            return "Maximum number of player for " +GetName() +" is "+ GetMaxNumPlayers();
        }
}
class GameWithTimeLimit extends Game {
    public int TimeLimit;
    public GameWithTimeLimit(String name, int MaxNumPlayers, int TimeLimit) {
        super(name, MaxNumPlayers);
        this.TimeLimit = TimeLimit;
    }
    @Override
    public String toString(){
        return "Maximum number of player for " +GetName() +" is "+ GetMaxNumPlayers()+"\n" +
                "Time Limit for "+GetName()+ " is " + TimeLimit +" minutes";
    }
}
