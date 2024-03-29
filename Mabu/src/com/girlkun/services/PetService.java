package com.girlkun.services;

    import com.girlkun.consts.ConstPlayer;
import com.girlkun.models.player.NewPet;
import com.girlkun.models.player.Pet;
import com.girlkun.models.player.Player;
import com.girlkun.services.func.ChangeMapService;
import com.girlkun.utils.SkillUtil;
import com.girlkun.utils.Util;

public class PetService {

    private static PetService i;

    public static PetService gI() {
        if (i == null) {
            i = new PetService();
        }
        return i;
    }

    public void createNormalPet(Player player, int gender, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, false, false,false,false,false,false, (byte) gender);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                }
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "Xin hãy thu nhận làm đệ tử");
            } catch (Exception e) {
            }
        }).start();
    }

    public void createNormalPet(Player player, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, false, false,false,false,false,false);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                }
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "Xin hãy thu nhận làm đệ tử");
            } catch (Exception e) {
            }
        }).start();
    }

    public void createMabuPet(Player player, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, true, false,false,false,false,false);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                }
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "Oa oa oa...");
            } catch (Exception e) {
            }
        }).start();
    }

    public void createMabuPet(Player player, int gender, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, true, false,false,false,false,false, (byte) gender);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                }
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "Oa oa oa...");
            } catch (Exception e) {
            }
        }).start();
    }
    public void createBerusPet(Player player, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, false, true,false,false,false,false);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                }
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "Thần hủy diệt hiện thân tất cả quỳ xuống...");
            } catch (Exception e) {
            }
        }).start();
    }
    public void creategohanPet(Player player, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, false, false,false,true,false,false);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                }
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "DIT ME CHUNG MAY...");
            } catch (Exception e) {
            }
        }).start();
    }
public void createmoriPet(Player player, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, false, false,false,false,true,false);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                }
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "DIT ME CHUNG MAY...");
            } catch (Exception e) {
            }
        }).start();
    }
public void creategokuPet(Player player, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, false, false,false,false,false,true);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                }
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "DIT ME CHUNG MAY...");
            } catch (Exception e) {
            }
        }).start();
    }
    public void createBerusPet(Player player, int gender, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, false, true,false,false,false,false, (byte) gender);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                     //gender = player.pet.gender;
                }
               
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "Thần hủy diệt hiện thân tất cả quỳ xuống...");
            } catch (Exception e) {
            }
        }).start();
    }
    public void creategohanPet(Player player, int gender, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, false, false,false,true,false,false, (byte) gender);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                     //gender = player.pet.gender;
                }
               
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "Thần hủy diệt hiện thân tất cả quỳ xuống...");
            } catch (Exception e) {
            }
        }).start();
    }
    public void createmoriPet(Player player, int gender, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, false, false,false,false,true,false, (byte) gender);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                     //gender = player.pet.gender;
                }
               
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "Thần hủy diệt hiện thân tất cả quỳ xuống...");
            } catch (Exception e) {
            }
        }).start();
    }
    public void creategokuPet(Player player, int gender, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, false, false,false,false,false,true, (byte) gender);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                     //gender = player.pet.gender;
                }
               
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "Thần hủy diệt hiện thân tất cả quỳ xuống...");
            } catch (Exception e) {
            }
        }).start();
    }
    public void createPicPet(Player player, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, false, false,true,false,false,false);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                }
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "Sư Phụ SooMe hiện thân tụi m quỳ xuống...");
            } catch (Exception e) {
            }
        }).start();
    }

    public void createPicPet(Player player, int gender, byte... limitPower) {
        new Thread(() -> {
            try {
                createNewPet(player, false,false,true,false,false,false, (byte) gender);
                if (limitPower != null && limitPower.length == 1) {
                    player.pet.nPoint.limitPower = limitPower[0];
                }
                
                Thread.sleep(1000);
                Service.gI().chatJustForMe(player, player.pet, "Sư Phụ SooMe hiện thân tụi m quỳ xuống...");
            } catch (Exception e) {
            }
        }).start();
    }
    
     public void createGokuVoCucPetVip(Player player, boolean isChange, byte gender) {
        byte limitPower;
        if (isChange) {
            limitPower = player.pet.nPoint.limitPower;
            if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
                player.pet.unFusion();
            }
            ChangeMapService.gI().exitMap(player.pet);
            player.pet.dispose();
            player.pet = null;
        } else {
            limitPower = 1;
        }
        new Thread(() -> {
            try {
                Pet pet = new Pet(player);
                pet.name = "$Đệ Goku Vô Cực";
                pet.gender = gender;
                pet.id = -player.id;
                pet.nPoint.power = 1500000;
                pet.typePet = 12;
                pet.nPoint.stamina = 1000;
                pet.nPoint.maxStamina = 1000;
                pet.nPoint.hpg = 4000;
                pet.nPoint.mpg = 4000;
                pet.nPoint.dameg = 300;
                pet.nPoint.defg = 150;
                pet.nPoint.critg = 20;
                for (int i = 0; i < 7; i++) {
                    pet.inventory.itemsBody.add(ItemService.gI().createItemNull());
                }
                pet.playerSkill.skills.add(SkillUtil.createSkill(Util.nextInt(0, 2) * 2, 1));
                for (int i = 0; i < 4; i++) {
                    pet.playerSkill.skills.add(SkillUtil.createEmptySkill());
                }
                pet.nPoint.setFullHpMp();
                player.pet = pet;
                ;
                player.pet.nPoint.limitPower = limitPower;
                Thread.sleep(1000);
                Service.getInstance().chatJustForMe(player, player.pet, "Đệ tử vip vãi nồi đây...");
            } catch (Exception e) {
            }
        }).start();
    }
    public void createBlackGokuPetVip(Player player, boolean isChange, byte gender) {
        byte limitPower;
        if (isChange) {
            limitPower = player.pet.nPoint.limitPower;
            if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
                player.pet.unFusion();
            }
            ChangeMapService.gI().exitMap(player.pet);
            player.pet.dispose();
            player.pet = null;
        } else {
            limitPower = 1;
        }
        new Thread(() -> {
            try {
                Pet pet = new Pet(player);
                pet.name = "$Đệ Black Goku";
                pet.gender = gender;
                pet.id = -player.id;
                pet.nPoint.power = 1500000;
                pet.typePet = 13;
                pet.nPoint.stamina = 1000;
                pet.nPoint.maxStamina = 1000;
                pet.nPoint.hpg = 4500;
                pet.nPoint.mpg = 4500;
                pet.nPoint.dameg = 310;
                pet.nPoint.defg = 200;
                pet.nPoint.critg = 22;
                for (int i = 0; i < 7; i++) {
                    pet.inventory.itemsBody.add(ItemService.gI().createItemNull());
                }
                pet.playerSkill.skills.add(SkillUtil.createSkill(Util.nextInt(0, 2) * 2, 1));
                for (int i = 0; i < 4; i++) {
                    pet.playerSkill.skills.add(SkillUtil.createEmptySkill());
                }
                pet.nPoint.setFullHpMp();
                player.pet = pet;
                ;
                player.pet.nPoint.limitPower = limitPower;
                Thread.sleep(1000);
                Service.getInstance().chatJustForMe(player, player.pet, "Đệ tử vip vãi nồi đây...");
            } catch (Exception e) {
            }
        }).start();
    }
    public void createAbinusPetVip(Player player, boolean isChange, byte gender) {
        byte limitPower;
        if (isChange) {
            limitPower = player.pet.nPoint.limitPower;
            if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
                player.pet.unFusion();
            }
            ChangeMapService.gI().exitMap(player.pet);
            player.pet.dispose();
            player.pet = null;
        } else {
            limitPower = 1;
        }
        new Thread(() -> {
            try {
                Pet pet = new Pet(player);
                pet.name = "$Đệ Abinus";
                pet.gender = gender;
                pet.id = -player.id;
                pet.nPoint.power = 1500000;
                pet.typePet = 14;
                pet.nPoint.stamina = 1000;
                pet.nPoint.maxStamina = 1000;
                pet.nPoint.hpg = 5000;
                pet.nPoint.mpg = 5000;
                pet.nPoint.dameg = 320;
                pet.nPoint.defg = 250;
                pet.nPoint.critg = 25;
                for (int i = 0; i < 7; i++) {
                    pet.inventory.itemsBody.add(ItemService.gI().createItemNull());
                }
                pet.playerSkill.skills.add(SkillUtil.createSkill(Util.nextInt(0, 2) * 2, 1));
                for (int i = 0; i < 4; i++) {
                    pet.playerSkill.skills.add(SkillUtil.createEmptySkill());
                }
                pet.nPoint.setFullHpMp();
                player.pet = pet;
                ;
                player.pet.nPoint.limitPower = limitPower;
                Thread.sleep(1000);
                Service.getInstance().chatJustForMe(player, player.pet, "Đệ tử vip vãi nồi đây...");
            } catch (Exception e) {
            }
        }).start();
    }
    public void createDauMoiPetVip(Player player, boolean isChange, byte gender) {
        byte limitPower;
        if (isChange) {
            limitPower = player.pet.nPoint.limitPower;
            if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
                player.pet.unFusion();
            }
            ChangeMapService.gI().exitMap(player.pet);
            player.pet.dispose();
            player.pet = null;
        } else {
            limitPower = 1;
        }
        new Thread(() -> {
            try {
                Pet pet = new Pet(player);
                pet.name = "$Đệ Đầu Moi";
                pet.gender = gender;
                pet.id = -player.id;
                pet.nPoint.power = 1500000;
                pet.typePet = 15;
                pet.nPoint.stamina = 1000;
                pet.nPoint.maxStamina = 1000;
                pet.nPoint.hpg = 5000;
                pet.nPoint.mpg = 5000;
                pet.nPoint.dameg = 320;
                pet.nPoint.defg = 250;
                pet.nPoint.critg = 25;
                for (int i = 0; i < 7; i++) {
                    pet.inventory.itemsBody.add(ItemService.gI().createItemNull());
                }
                pet.playerSkill.skills.add(SkillUtil.createSkill(Util.nextInt(0, 2) * 2, 1));
                for (int i = 0; i < 4; i++) {
                    pet.playerSkill.skills.add(SkillUtil.createEmptySkill());
                }
                pet.nPoint.setFullHpMp();
                player.pet = pet;
                ;
                player.pet.nPoint.limitPower = limitPower;
                Thread.sleep(1000);
                Service.getInstance().chatJustForMe(player, player.pet, "Đệ tử vip vãi nồi đây...");
            } catch (Exception e) {
            }
        }).start();
    }
    public void createpetboss0(Player player, boolean isChange, byte gender) {
        byte limitPower;
        if (isChange) {
            limitPower = player.pet.nPoint.limitPower;
            if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
                player.pet.unFusion();
            }
            ChangeMapService.gI().exitMap(player.pet);
            player.pet.dispose();
            player.pet = null;
        } else {
            limitPower = 1;
        }
        new Thread(() -> {
            try {
                Pet pet = new Pet(player);
                pet.name = "Gohan Beast";
                pet.gender = 0;
                pet.id = -player.id;
                pet.nPoint.power = 1500000;
                pet.typePet = 20;
                pet.nPoint.stamina = 1000;
                pet.nPoint.maxStamina = 1000;
                pet.nPoint.hpg = 5000;
                pet.nPoint.mpg = 5000;
                pet.nPoint.dameg = 320;
                pet.nPoint.defg = 250;
                pet.nPoint.critg = 25;
                for (int i = 0; i < 7; i++) {
                    pet.inventory.itemsBody.add(ItemService.gI().createItemNull());
                }
                pet.playerSkill.skills.add(SkillUtil.createSkill(Util.nextInt(0, 2) * 2, 1));
                for (int i = 0; i < 4; i++) {
                    pet.playerSkill.skills.add(SkillUtil.createEmptySkill());
                }
                pet.nPoint.setFullHpMp();
                player.pet = pet;
                ;
                player.pet.nPoint.limitPower = limitPower;
                Thread.sleep(1000);
                Service.getInstance().chatJustForMe(player, player.pet, "DIT ME MAY ");
            } catch (Exception e) {
            }
        }).start();
    }
    public void createpetboss1(Player player, boolean isChange, byte gender) {
        byte limitPower;
        if (isChange) {
            limitPower = player.pet.nPoint.limitPower;
            if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
                player.pet.unFusion();
            }
            ChangeMapService.gI().exitMap(player.pet);
            player.pet.dispose();
            player.pet = null;
        } else {
            limitPower = 1;
        }
        new Thread(() -> {
            try {
                Pet pet = new Pet(player);
                pet.name = "Morimata";
                pet.gender = 1;
                pet.id = -player.id;
                pet.nPoint.power = 1500000;
                pet.typePet = 21;
                pet.nPoint.stamina = 1000;
                pet.nPoint.maxStamina = 1000;
                pet.nPoint.hpg = 5000;
                pet.nPoint.mpg = 5000;
                pet.nPoint.dameg = 320;
                pet.nPoint.defg = 250;
                pet.nPoint.critg = 25;
                for (int i = 0; i < 7; i++) {
                    pet.inventory.itemsBody.add(ItemService.gI().createItemNull());
                }
                pet.playerSkill.skills.add(SkillUtil.createSkill(Util.nextInt(0, 2) * 2, 1));
                for (int i = 0; i < 4; i++) {
                    pet.playerSkill.skills.add(SkillUtil.createEmptySkill());
                }
                pet.nPoint.setFullHpMp();
                player.pet = pet;
                ;
                player.pet.nPoint.limitPower = limitPower;
                Thread.sleep(1000);
                Service.getInstance().chatJustForMe(player, player.pet, "DIT ME MAY ");
            } catch (Exception e) {
            }
        }).start();
    }
    public void createpetboss2(Player player, boolean isChange, byte gender) {
        byte limitPower;
        if (isChange) {
            limitPower = player.pet.nPoint.limitPower;
            if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
                player.pet.unFusion();
            }
            ChangeMapService.gI().exitMap(player.pet);
            player.pet.dispose();
            player.pet = null;
        } else {
            limitPower = 1;
        }
        new Thread(() -> {
            try {
                Pet pet = new Pet(player);
                pet.name = "Goku SVIP";
                pet.gender = 2;
                pet.id = -player.id;
                pet.nPoint.power = 1500000;
                pet.typePet = 22;
                pet.nPoint.stamina = 1000;
                pet.nPoint.maxStamina = 1000;
                pet.nPoint.hpg = 5000;
                pet.nPoint.mpg = 5000;
                pet.nPoint.dameg = 320;
                pet.nPoint.defg = 250;
                pet.nPoint.critg = 25;
                for (int i = 0; i < 7; i++) {
                    pet.inventory.itemsBody.add(ItemService.gI().createItemNull());
                }
                pet.playerSkill.skills.add(SkillUtil.createSkill(Util.nextInt(0, 2) * 2, 1));
                for (int i = 0; i < 4; i++) {
                    pet.playerSkill.skills.add(SkillUtil.createEmptySkill());
                }
                pet.nPoint.setFullHpMp();
                player.pet = pet;
                ;
                player.pet.nPoint.limitPower = limitPower;
                Thread.sleep(1000);
                Service.getInstance().chatJustForMe(player, player.pet, "DIT ME MAY ");
            } catch (Exception e) {
            }
        }).start();
    }
    public void changeNormalPet(Player player, int gender) {
        byte limitPower = player.pet.nPoint.limitPower;
        if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
            player.pet.unFusion();
        }
        ChangeMapService.gI().exitMap(player.pet);
        player.pet.dispose();
        player.pet = null;
        createNormalPet(player, gender, limitPower);
    }

    public void changeNormalPet(Player player) {
        byte limitPower = player.pet.nPoint.limitPower;
        if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
            player.pet.unFusion();
        }
        ChangeMapService.gI().exitMap(player.pet);
        player.pet.dispose();
        player.pet = null;
        createNormalPet(player, limitPower);
    }

    public void changeMabuPet(Player player) {
        byte limitPower = player.pet.nPoint.limitPower;
        if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
            player.pet.unFusion();
        }
        ChangeMapService.gI().exitMap(player.pet);
        player.pet.dispose();
        player.pet = null;
        createMabuPet(player, limitPower);
    }

    public void changeMabuPet(Player player, int gender) {
        byte limitPower = player.pet.nPoint.limitPower;
        if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
            player.pet.unFusion();
        }
        ChangeMapService.gI().exitMap(player.pet);
        player.pet.dispose();
        player.pet = null;
        createMabuPet(player, gender, limitPower);
    }
   /* public void changeBerusPet(Player player) {
        byte limitPower = player.pet.nPoint.limitPower;
        if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
            player.pet.unFusion();
        }
        ChangeMapService.gI().exitMap(player.pet);
        player.pet.dispose();
        player.pet = null;
        createBerusPet(player, limitPower);
    }*/

    public void changeBerusPet(Player player, int gender) {
        byte limitPower = player.pet.nPoint.limitPower;
        if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
            player.pet.unFusion();
        }
        ChangeMapService.gI().exitMap(player.pet);
        player.pet.dispose();
        player.pet = null;
        createBerusPet(player, gender, limitPower);
    } 
    public void changegohanPet(Player player, int gender) {
        byte limitPower = player.pet.nPoint.limitPower;
        if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
            player.pet.unFusion();
        }
        ChangeMapService.gI().exitMap(player.pet);
        player.pet.dispose();
        player.pet = null;
        creategohanPet(player, gender, limitPower);
    } 
    public void changegokuPet(Player player, int gender) {
        byte limitPower = player.pet.nPoint.limitPower;
        if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
            player.pet.unFusion();
        }
        ChangeMapService.gI().exitMap(player.pet);
        player.pet.dispose();
        player.pet = null;
        creategokuPet(player, gender, limitPower);
    } 
    public void changemoriPet(Player player, int gender) {
        byte limitPower = player.pet.nPoint.limitPower;
        if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
            player.pet.unFusion();
        }
        ChangeMapService.gI().exitMap(player.pet);
        player.pet.dispose();
        player.pet = null;
        createmoriPet(player, gender, limitPower);
    } 
    public void changePicPet(Player player) {
        byte limitPower = player.pet.nPoint.limitPower;
        if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
            player.pet.unFusion();
        }
        ChangeMapService.gI().exitMap(player.pet);
        player.pet.dispose();
        player.pet = null;
        createPicPet(player, limitPower);
    }

    public void changePicPet(Player player, int gender) {
        byte limitPower = player.pet.nPoint.limitPower;
        if (player.fusion.typeFusion != ConstPlayer.NON_FUSION) {
            player.pet.unFusion();
        }
        ChangeMapService.gI().exitMap(player.pet);
        player.pet.dispose();
        player.pet = null;
        createPicPet(player, gender, limitPower);
    }
    public void changeNamePet(Player player, String name) {
        try {
            if (!InventoryServiceNew.gI().isExistItemBag(player, 400)) {
                Service.gI().sendThongBao(player, "Bạn cần thẻ đặt tên đệ tử, mua tại Santa");
                return;
            } else if (Util.haveSpecialCharacter(name)) {
                Service.gI().sendThongBao(player, "Tên không được chứa ký tự đặc biệt");
                return;
            } else if (name.length() > 10) {
                Service.gI().sendThongBao(player, "Tên quá dài");
                return;
            }
            ChangeMapService.gI().exitMap(player.pet);
            player.pet.name = "$" + name.toLowerCase().trim();
            InventoryServiceNew.gI().subQuantityItemsBag(player, InventoryServiceNew.gI().findItemBag(player, 400), 1);
            new Thread(() -> {
                try {
                    Thread.sleep(1000);
                    Service.gI().chatJustForMe(player, player.pet, "Cảm ơn sư phụ đã đặt cho con tên " + name);
                } catch (Exception e) {
                }
            }).start();
        } catch (Exception ex) {

        }
    }

    private int[] getDataPetNormal() {
        int[] hpmp = {1700, 1800, 1900, 2000, 2100, 2200};
        int[] petData = new int[5];
        petData[0] = Util.nextInt(40, 105) * 20; //hp
        petData[1] = Util.nextInt(40, 105) * 20; //mp
        petData[2] = Util.nextInt(20, 45); //dame
        petData[3] = Util.nextInt(9, 50); //def
        petData[4] = Util.nextInt(0, 2); //crit
        return petData;
    }

    private int[] getDataPetMabu() {
        int[] hpmp = {1700, 1800, 1900, 2000, 2100, 2200};
        int[] petData = new int[5];
        petData[0] = Util.nextInt(40, 105) * 20; //hp
        petData[1] = Util.nextInt(40, 105) * 20; //mp
        petData[2] = Util.nextInt(50, 120); //dame
        petData[3] = Util.nextInt(9, 50); //def
        petData[4] = Util.nextInt(0, 2); //crit
        return petData;
    }
    private int[] getDataPetPic() {
        int[] hpmp = {1800, 1900, 2000, 2100, 2200,2300};
        int[] petData = new int[5];
        petData[0] = Util.nextInt(40, 115) * 20; //hp
        petData[1] = Util.nextInt(40, 115) * 20; //mp
        petData[2] = Util.nextInt(70, 140); //dame
        petData[3] = Util.nextInt(9, 50); //def
        petData[4] = Util.nextInt(0, 2); //crit
        return petData;
    }
    private int[] getDataPetBerus() {
        int[] hpmp = {1800, 1900, 2000, 2100, 2200,2300};
        int[] petData = new int[5];
        petData[0] = Util.nextInt(40, 115) * 20; //hp
        petData[1] = Util.nextInt(40, 115) * 20; //mp
        petData[2] = Util.nextInt(70, 140); //dame
        petData[3] = Util.nextInt(9, 50); //def
        petData[4] = Util.nextInt(0, 2); //crit
        return petData;
    }
    private void createNewPet(Player player, boolean isMabu, boolean isBerus,boolean isPic,boolean isGohan,boolean isMori,boolean isGoku, byte... gender) {
        int[] data = isMabu ? isPic ? isBerus ? isGohan ? isMori ? isGoku? getDataPetMabu():getDataPetPic() : getDataPetBerus() : getDataPetNormal() : getDataPetBerus() : getDataPetBerus():getDataPetBerus();
        Pet pet = new Pet(player);
        pet.name = "$" + (isMabu ? "Mabư" : isBerus ? "Berus" : isPic ? "Pic" : isGohan ? "Gohan Beast" : isMori ? "Morimata" : isGoku ? "Goku SVIP" : "Đệ tử" );
        pet.gender = (gender != null && gender.length != 0) ? gender[0] : (byte) Util.nextInt(0, 2);
        pet.id = -player.id;
        pet.nPoint.power = isMabu || isBerus|| isPic || isGohan || isMori || isGoku ? 1500000 : 2000;
        pet.typePet = (byte) (isMabu ? 1 : isBerus ? 2 :isPic ? 3: isGohan ? 20: isMori ? 21: isGoku?22 : 0);
        pet.nPoint.stamina = 1000;
        pet.nPoint.maxStamina = 1000;
        pet.nPoint.hpg = data[0];
        pet.nPoint.mpg = data[1];
        pet.nPoint.dameg = data[2];
        pet.nPoint.defg = data[3];
        pet.nPoint.critg = data[4];
        for (int i = 0; i < 7; i++) {
            pet.inventory.itemsBody.add(ItemService.gI().createItemNull());
        }
        pet.playerSkill.skills.add(SkillUtil.createSkill(Util.nextInt(0, 2) * 2, 1));
        for (int i = 0; i < 3; i++) {
            pet.playerSkill.skills.add(SkillUtil.createEmptySkill());
        }
        pet.nPoint.setFullHpMp();
        player.pet = pet;
    }

    public static void Pet2(Player pl, int h, int b, int l) {
        if (pl.newpet != null) {
            pl.newpet.dispose();
//            pl.newpet1.dispose();
        }
        pl.newpet = new NewPet(pl, (short) h, (short) b, (short) l);
     //   pl.newpet1 = new NewPet(pl, (short) h, (short) b, (short) l);
        pl.newpet.name = "$";
      //  pl.newpet1.name = "$";
        pl.newpet.gender = pl.gender;
        //  pl.newpet1.gender = pl.gender;
        pl.newpet.nPoint.tiemNang = 1;
      //   pl.newpet1.nPoint.tiemNang = 1;
        pl.newpet.nPoint.power = 1;
      //  pl.newpet1.nPoint.power = 1;
        pl.newpet.nPoint.limitPower = 1;
      //   pl.newpet1.nPoint.limitPower = 1;
        pl.newpet.nPoint.hpg = 500000000;
      //  pl.newpet1.nPoint.hpg = 500000000;
        pl.newpet.nPoint.mpg = 500000000;
       // pl.newpet1.nPoint.mpg = 500000000;
        pl.newpet.nPoint.hp = 500000000;
        pl.newpet.nPoint.mp = 500000000;
        pl.newpet.nPoint.dameg = 1;
        pl.newpet.nPoint.defg = 1;
        pl.newpet.nPoint.critg = 1;
        pl.newpet.nPoint.stamina = 1;
        pl.newpet.nPoint.setBasePoint();
        pl.newpet.nPoint.setFullHpMp();
//        pl.newpet1.nPoint.hp = 500000000;
//        pl.newpet1.nPoint.mp = 500000000;
//        pl.newpet1.nPoint.dameg = 1;
//        pl.newpet1.nPoint.defg = 1;
//        pl.newpet1.nPoint.critg = 1;
//        pl.newpet1.nPoint.stamina = 1;
//        pl.newpet1.nPoint.setBasePoint();
//        pl.newpet1.nPoint.setFullHpMp();
    }
 
    //--------------------------------------------------------------------------
}
