/*
Valid parantheses - not solved

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

Example 2:

Input: s = "()[]{}"
Output: true
*/

class Solution {

        public char brace = '(';
        public char inverseBrace = ')';

        public char parantheses = '{';
        public char inverseParantheses = '}';

        public char square = '[';
        public char inverseSquare = ']';

    public boolean isValid(String s) {

        List<Character> stack =  new ArrayList<>();
        s.chars().map($ -> $ + 1).forEach($ -> stack.add(Character.valueOf((char) $)));

        for(int i = 0; i < stack.size(); i++) {

            if (stack.get(i) == brace || stack.get(i) == parantheses || stack.get(i) == square) {
                stack.add(stack.get(i));
                stack.remove(i);
            }

            if ((stack.get(i) == inverseBrace && stack.get(stack.size() - 1) == brace) || 
                (stack.get(i) == inverseParantheses && stack.get(stack.size() - 1) == parantheses) || 
                (stack.get(i) == inverseSquare && stack.get(stack.size() - 1) == square)
            ) {
                stack.remove(stack.size() - 1);
                stack.remove(i);
                if (stack.size() == 0)
                    return true;
            } else {
                return false;
            }

        }

        return true;

    }


}
