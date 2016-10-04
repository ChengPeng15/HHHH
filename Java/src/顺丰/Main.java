package 顺丰;

import java.io.*;
import java.util.*;
public class Main {
    // 标记是否使用过这个棒子，在递归时后需要标记
    static boolean[] used;
    // 棒子总数量
    static int len;
    // 棒子的数组
    static int[] s;
    // 总长度
    static int sum;
    // 假设的原棒长
    static int max;
    // 棒子数量 = 总长度/原棒长
    static int parts;
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(
                System.in));
        while ((len = Integer.parseInt(read.readLine())) != 0) {
            s = new int[len];
            StringTokenizer take = new StringTokenizer(read.readLine());
            int index = 0;
            sum = 0;
            used = new boolean[len];
            while (take.hasMoreTokens()) {
                s[index] = Integer.parseInt(take.nextToken());
                sum += s[index++];
            }
            Arrays.sort(s);
            // 起始假设原棒长=最长棒的长度
            max = s[len - 1];
            for (; max <= sum; max++) {
                // 穷举棒子长度，只取总长度模原长度=0的情况
                if (sum % max == 0) {
                    // 原棒的数量
                    parts = sum / max;
                    // 递归搜索
                    if (search(0, len - 1, 0)) {
                        System.out.println(max);
                        break;
                    }
                }
            }
        }
    }
    public static boolean search(int res, int next, int cpl) {
        // 如果凑成了一根棒子，继续凑下面一个
        if (res == max) {
            // 这个是现在这个棒子的长度，初始化为0
            res = 0;
            // 这里等于len-2只是一个初始化，反正len-1肯定被占用了，我何不从len-2开始呢，反正后面还要判断有没有被使用过
            next = len - 2;
            // 这个是已经凑成的棒子数
            cpl++;
        }
        // 如果凑成了parts这么多棒子，那就结束了，搜索完成
        if (cpl == parts) {
            return true;
        }
        // 从后往前搜索
        while (next >= 0) {
            // 如果没有被使用的话
            if (used[next] == false) {
                // 那么判断下这根棒子能不能放进我现在剩余的空间里面
                if (res + s[next] <= max) {
                    // 能放得进的话，那么标记这跟棒子已经使用过了
                    used[next] = true;
                    // 继续寻找下一根
                    if (search(res + s[next], next - 1, cpl)) {
                        // 返回结果为true表示全部凑成功了
                        return true;
                    }
                    // 如果没有凑成功，我把这根棒子不放进去并标记为false
                    used[next] = false;
                    // 如果第一块的都没放不进去的话，那么说明找的有问题，直接退出了
                    if (res == 0) {
                        break;
                    }
                    // 如果现在本来应该尝试成功的（已经拼成了一个原棒，应该进入递归变成0的）却失败了，说明找的有问题
                    if (res + s[next] == max) {
                        break;
                    }
                }
                // 找下一块不相等的棒子
                int i = next - 1;
                while (i >= 0 && s[i] == s[next]) {
                    i--;
                }
                next = i;
                // 如果剩下的和比我需要的棒子还小的话，就不用凑了
                int l_s = 0;
                for (int j = next; j >= 0; j--) {
                    if (!used[j]) {
                        l_s += s[j];
                    }
                }
                if (l_s < max - res) {
                    break;
                }
                // 继续找下面的棒子
                continue;
            }
            // 说明这个棒子被用过了，找下面一个棒子
            next--;
        }
        // 如果从这里出来的话，表示程序不能凑完所有棒子
        return false;
    }
}
