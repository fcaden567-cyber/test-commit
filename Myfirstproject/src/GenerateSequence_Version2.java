public static String GenerateSequence(int S, int N) {
    // Test 1: Check if S and N are valid positive (>0) integers
    if (S <= 0 || N <= 0) {
        return "ERROR#1";
    }

    // Test 2: Check if S > 100
    if (S > 100) {
        return "ERROR#2";
    }

    // Test 3: Build the sequence
    String result = "";
    int prev2 = S;        // two positions back
    int prev1 = S + 1;    // one position back

    for (int i = 0; i < N; i++) {
        if (i == 0) {
            result += prev2;
        } else if (i == 1) {
            result += " " + prev1;
        } else {
            int next = prev2 + prev1;
            result += " " + next;
            prev2 = prev1;
            prev1 = next;
        }
    }

    return result;
}