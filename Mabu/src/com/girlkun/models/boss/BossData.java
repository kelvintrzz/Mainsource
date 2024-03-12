package com.girlkun.models.boss;

import lombok.Builder;
import lombok.Data;


@Data
public class BossData {

    public static final int DEFAULT_APPEAR = 0;
    public static final int APPEAR_WITH_ANOTHER = 1;
    public static final int ANOTHER_LEVEL = 2;

    private String name;

    private byte gender;

    private short[] outfit;

    private long dame;

    private long[] hp;
    
    private int[] mapJoin;

    private int[][] skillTemp;

    private String[] textS;

    private String[] textM;

    private String[] textE;

    private int secondsRest;

    private TypeAppear typeAppear;

    private int[] bossesAppearTogether;

    @Builder
    public BossData(String name, byte gender, int dame, long[] hp,
                    short[] outfit, int[] mapJoin, int[][] skillTemp,
                    int secondsRest, String[] textS, String[] textM,
                    String[] textE) {
        this.name = name;
        this.gender = gender;
        this.dame = dame/100*2;
        this.hp = hp;
        this.outfit = outfit;
        this.mapJoin = mapJoin;
        this.skillTemp = skillTemp;
        this.secondsRest = secondsRest;
        this.textS = new String[]{};
        this.textM = new String[]{};
        this.textE = new String[]{};
    }

    private BossData(String name, byte gender, short[] outfit, long dame, long[] hp,
                     int[] mapJoin, int[][] skillTemp, String[] textS, String[] textM,
                     String[] textE) {
        this.name = name;
        this.gender = gender;
        this.outfit = outfit;
        this.dame = dame/100*2;
        this.hp = hp;
        this.mapJoin = mapJoin;
        this.skillTemp = skillTemp;
        this.textS = textS;
        this.textM = textM;
        this.textE = textE;
        this.secondsRest = 0;
        this.typeAppear = TypeAppear.DEFAULT_APPEAR;
    }

    public BossData(String name, byte gender, short[] outfit, long dame, long[] hp,
                    int[] mapJoin, int[][] skillTemp, String[] textS, String[] textM,
                    String[] textE, int secondsRest) {
        this(name, gender, outfit, dame/100*2, hp, mapJoin, skillTemp, textS, textM, textE);
        this.secondsRest = secondsRest;
    }

    public BossData(String name, byte gender, short[] outfit, long dame, long[] hp,
                    int[] mapJoin, int[][] skillTemp, String[] textS, String[] textM,
                    String[] textE, int secondsRest, int[] bossesAppearTogether) {
        this(name, gender, outfit, dame/100*2, hp, mapJoin, skillTemp, textS, textM, textE, secondsRest);
        this.bossesAppearTogether = bossesAppearTogether;
    }

    public BossData(String name, byte gender, short[] outfit, long dame, long[] hp,
                    int[] mapJoin, int[][] skillTemp, String[] textS, String[] textM,
                    String[] textE, TypeAppear typeAppear) {
        this(name, gender, outfit, dame/100*2, hp, mapJoin, skillTemp, textS, textM, textE);
        this.typeAppear = typeAppear;
    }

    public BossData(String name, byte gender, short[] outfit, long dame, long[] hp,
                    int[] mapJoin, int[][] skillTemp, String[] textS, String[] textM,
                    String[] textE, int secondsRest, TypeAppear typeAppear) {
        this(name, gender, outfit, dame/100*2, hp, mapJoin, skillTemp, textS, textM, textE, secondsRest);
        this.typeAppear = typeAppear;
    }
}

/**
 * Vui lòng không sao chép mã nguồn này dưới mọi hình thức. Hãy tôn trọng tác
 * giả của mã nguồn này. Xin cảm ơn! - GirlBeo
 */
