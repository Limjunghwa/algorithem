package algo;

import java.util.LinkedList;
import java.util.Queue;

public class bfs_dfs {
	
	
	public static void bfs(int arr[][],int check[],int start){//너비 우선 탐색
		Queue<Integer> q = new LinkedList<>();
		check[start]=1;
		q.add(start);
		
		while(!q.isEmpty())//q가 비어있지 않다면
		{
			int node = q.poll();
			System.out.println("node:"+node+"");
			for(int i=0;i<arr[0].length;i++){
				if(arr[node][i]==1 &&check[i]==0 ){
					q.add(i);
					check[i]=1;
				}
			}
		}
	}
	public static void dfs(int arr[][],int check[],int start){//깊이 우선 탐색
		System.out.println("node:"+start); //방문 노드 출력
		check[start]=1;
		
		for(int i=1;i<arr[0].length;i++){
			if(arr[start][i]==1 && check[i]==0){
				dfs(arr,check,i);
			}
		}
		
	}
	public static void main(String args[]){
		int arr[][]={{0,1,1,0},{1,0,0,1},{1,0,0,0},{0,1,0,0}};
		int check_bfs[] = new int[4];
		int check_dfs[] = new int[4];
		for(int i=0;i<4;i++){
			check_bfs[i]=0;
			check_dfs[i]=0;
		}
		System.out.println("bfs start");
		bfs(arr,check_bfs,0);
		System.out.println("bfs end");
		System.out.println("dfs start");
		dfs(arr,check_dfs,0);
		System.out.println("dfs end");
	}

}
