import java.util.*;

class L2_Solution_49993_스킬트리_220508 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i = 0; i < skill_trees.length; i++) {
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < skill_trees[i].length(); j++) {
                String s = Character.toString(skill_trees[i].charAt(j));
                if(skill.contains(s))
                    sb.append(s);
            }

            if(sb.toString().equals(skill))
                answer++;
            else {
                if(sb.length() < skill.length())
                    if(skill.substring(0, sb.length()).equals(sb.toString()))
                        answer++;
            }
        }
        return answer;
    }
}
