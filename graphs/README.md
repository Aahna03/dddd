`Graph Basics`

# Question / Concept Beginner Approach Optimized / Pattern Insight

1 Graph Representation Manually store edges in lists/arrays Use adjacency list/matrix depending on density
2 Directed vs Undirected Graph Interpret edges intuitively Understand in-degree / out-degree & bidirectional edges
3 Detecting Connected Components Scan all nodes repeatedly BFS/DFS + visited array for all components

**Implementation**: `GraphBasics.java`

Graph Traversals

# Question / Concept Beginner Approach Optimized / Pattern Insight

4 BFS Traversal Use queue but forget visited checks Queue + visited array → O(V + E)
5 DFS Traversal Simple recursion without tracking Recursion + visited array → O(V + E)

**Implementation**: `GraphTraversals.java`

Intermediate Graphs

# Question / Concept Beginner Approach Optimized / Pattern Insight

6 Cycle detection (Directed/Undirected) Random traversal and guess Undirected: DFS with parent tracking
Directed: DFS recursion stack
7 Topological Sort Try removing edges & checking manually Kahn’s Algorithm (BFS with in-degrees) or DFS ordering

**Implementation**: `IntermediateGraphProblems.java`

Advanced Graphs

# Question / Concept Beginner Approach Optimized / Pattern Insight

8 Shortest Path (Dijkstra) Try all possible paths (brute force) Min-heap + adjacency list (O(E log V))
9 Minimum Spanning Tree (Prim/Kruskal) Sort edges & form manually Prim (Min Heap) / Kruskal (DSU)
10 Detect Bipartite Graph Naively try assigning colors BFS/DFS 2-coloring using alternating colors

**Implementation**: `AdvancedGraphProblems.java`
