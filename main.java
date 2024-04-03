int temperature = 14;

      if (temperature < 5) {
        System.out.println("Heating on!");
      }
      else if (5 <= temperature && temperature < 15) {
        System.out.println("Heating to be adjusted!");
      }
      else if (15 >= temperature && temperature < 30) {
        System.out.println("Heating off!");
      }
      else if (temperature >= 30) {
        System.out.println("Cooling on");
      }
    }
