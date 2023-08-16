package org.competition.leetcode.array;

import java.util.List;

public class SentenceSimilarity {

    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if(sentence1.length != sentence2.length) return false;
        else {
            for(int index1=0;index1<sentence1.length;index1++) { // iterate over sentence1
                if(!sentence1[index1].equals(sentence2[index1])) { // if the words at index1 are not equal
                    boolean found = false;
                    for(List<String> similarPair : similarPairs) { // are they similar?
                        if(similarPair.contains(sentence1[index1]) && similarPair.contains(sentence2[index1])) {
                            found = true;
                            break;
                        }
                    }
                    if(!found) return false;
                }
            }
        }
        return true;
    }
}
