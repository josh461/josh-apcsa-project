package tower;

public class TowerSolver {
   private TowerModel model;

   public TowerSolver() {
   }

   public void solve(TowerModel var1) {
      this.model = var1;
      this.solve(var1.height(), 0, 2, 1);
   }

   private void solve(int var1, int var2, int var3, int var4) {
      if (var1 == 1) {
         this.model.move(var2, var3);
      } else {
         this.solve(var1 - 1, var2, var4, var3);
         this.model.move(var2, var3);
         this.solve(var1 - 1, var4, var3, var2);
      }

   }
}
