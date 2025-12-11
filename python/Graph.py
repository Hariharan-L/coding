from collections import deque

class Graphlist:
    def __init__(self, v):
        # Initialize an adjacency list with 'v' vertices
        self.adjlist = [[] for _ in range(v)]

    def addedges(self, s, e):
        # Add edges for an undirected graph
        self.adjlist[s].append(e)
        self.adjlist[e].append(s)

    def print(self):
        # Print the adjacency list of the graph
        for i in range(len(self.adjlist)):
            print(f"adj list vertices: {i} => ", end="")
            for j in self.adjlist[i]:
                print(j, end=" ")
            print()

    def bfs(self, v):
        # Perform BFS starting from vertex 'v'
        V = len(self.adjlist)
        queue = deque()
        visited = [False] * V
        visited[v] = True
        queue.append(v)

        while queue:
            vertex = queue.popleft()
            print(vertex, end=" ")

            for av in self.adjlist[vertex]:
                if not visited[av]:
                    queue.append(av)
                    visited[av] = True
        print()

    def dfs(self, v):
        # Perform DFS starting from vertex 'v'
        V = len(self.adjlist)
        visited = [False] * V
        self.dfs_util(v, visited)

    def dfs_util(self, v, visited):
        # Utility function for DFS
        visited[v] = True
        print(v, end=" ")

        for av in self.adjlist[v]:
            if not visited[av]:
                self.dfs_util(av, visited)

# Test the graph
if __name__ == "__main__":
    graphlist = Graphlist(5)
    graph = [
        [0, 1, 0, 0, 1],
        [1, 0, 1, 1, 0],
        [0, 1, 0, 1, 1],
        [0, 1, 1, 0, 1],
        [1, 0, 1, 1, 0]
    ]
    graphlist.addedges(0, 1)
    graphlist.addedges(0, 4)
    graphlist.addedges(1, 2)
    graphlist.addedges(1, 3)
    graphlist.addedges(2, 3)
    graphlist.addedges(2, 4)
    graphlist.addedges(3, 4)
    graphlist.print()
    graphlist.bfs(3)
    graphlist.dfs(1)