package 去哪网;

public class 链家测试 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		#include <stdio.h>
		#include <stdlib.h>
		#include <string.h>

		#define WORD_NUM          256
		struct trie_node {
			struct trie_node *node[WORD_NUM];
			int value;
			int count;
		};

		struct heap_node {
			char *word;
			int count;
		};

		void adjust_heap(struct heap_node *h, int len, int pos);
		void create_heap(struct heap_node *h, int len);
		void heap_sort(struct heap_node *h, int len);
		int heap_insert_node(struct heap_node *h, int len, struct heap_node n);
		void heap_insert_word(struct heap_node *h, int len, char *word, int count);
		void destroy_heap(struct heap_node *h, int len);
		void show_top_ten_word(struct heap_node *h, int len);

		struct trie_node *create_trie_node(int value);
		int trie_insert_word(struct trie_node *root, unsigned char *word);
		void destory_trie_tree(struct trie_node *root);

		void adjust_heap(struct heap_node *h, int len, int pos)
		{
			int r, l, mark;

			l = 2 * pos;
			r = l + 1;
			mark = pos;
			if (l >= len) {
				return;
			}

			if ( h[mark].count > h[l].count) {
				mark = l;
			}
			if (r < len && h[mark].count > h[r].count) {
				mark = r;
			}
			if (mark != pos) {
				struct heap_node tmp;
				tmp = h[mark];
				h[mark] = h[pos];
				h[pos] = tmp;
				adjust_heap(h, len, mark);
			}
		}	

		void create_heap(struct heap_node *h, int len) 
		{
			int range = len / 2;
			
			while (range >= 0) {
				adjust_heap(h, len, range--);
			}
		}

		void heap_sort(struct heap_node *h, int len) 
		{
			struct heap_node n;
			create_heap(h, len);
			while (len > 0) {
				len--;
				n = h[len];
				h[len] = h[0];
				h[0] = n;
				adjust_heap(h, len, 0);
			}
		}

		void heap_insert_word(struct heap_node *h, int len, char *word, int count) 
		{
			struct heap_node n;
			int size = strlen(word) + 1;
			n.word = malloc(size);
			n.count = count;
			memcpy(n.word, word, size);
			if (heap_insert_node(h, len, n) != 0) {
				free(n.word);
			}
		}	

		// 不需要插入堆中和已经存在堆中 return -1, 插入返回 0
		int heap_insert_node(struct heap_node *h, int len, struct heap_node n)
		{
			int i;
			if (h[0].count > n.count) {
				return -1;
			}
			
			for (i = 0; i < len; i++) {
				if (strcmp(h[i].word, n.word) == 0) {
					h[i].count = n.count;
					break;
				}
			}
			if (i == len) {
				free(h[0].word);
				h[0] = n;
				adjust_heap(h, len, 0);
				return 0;
			}
			else {
				adjust_heap(h, len, i);
				return -1;
			}
		}
		void destroy_heap(struct heap_node *h, int len)
		{
			while (len > 0) {
			   free(h[--len].word);
			}
			free(h);
			h = NULL;
		}	

		void show_top_ten_word(struct heap_node *h, int len)
		{
			int i;
			heap_sort(h, len);
			for (i = 0; i < len; i++) {
				printf("%-8d %s\n", h[i].count, h[i].word);
			}
		}

		struct trie_node *create_trie_node(int value)
		{
			struct trie_node * node = calloc(1, sizeof(struct trie_node));
			node->value = value;
			return node;
		}
		int trie_insert_word(struct trie_node *root, unsigned char *word) 
		{
			struct trie_node *n;
			while (*word != 0) {
				n = root->node[*word];
				if (n == NULL) {
					n = create_trie_node(*word);
					root->node[*word] = n;
				}
				root = n;
				word++;
			}
			root->count++;
			return root->count;
		}
		void destroy_trie_tree(struct trie_node *root) 
		{
			int i;
			if (root == NULL) {
				return;
			}
			for (i = 0; i < WORD_NUM; i++) {
				destroy_trie_tree(root->node[i]);
			}
			free(root);
		}

		int main(int argc, char *argv[])
		{
			FILE *fp;
			struct trie_node *root;
			struct heap_node *h;
			int heap_len;	
			char line[1024];
			if (argc != 2) {
				return 0;
			}

			root = malloc(sizeof(struct trie_node));
			heap_len = 10;
			h = calloc(heap_len, sizeof(struct heap_node));

			fp = fopen(argv[1], "r");
			if (fp == NULL) {
				return 0;
			}
			int start = 0;
			while (fgets(line, sizeof(line), fp)) {
				int count;
				int word_len = strlen(line) - 1;
				line[word_len] = 0;
				count = trie_insert_word(root, (unsigned char *) line);
				if (start < heap_len) {
					int i;
					for (i = 0; i < start; i++) {
						if (strcmp(h[i].word, line) == 0) {
							h[i].count = count;
							break;
						}
					}
					if (i == start) {
						h[start].word = malloc(word_len);
						memcpy(h[start].word, line, word_len);
						h[start].count = count;
						start++;
						create_heap(h, start);		
					}
				}
				else {
					heap_insert_word(h, heap_len, line, count);
				}

			}	
			fclose(fp);
			heap_len = start;
			show_top_ten_word(h, heap_len);
			destroy_heap(h, heap_len);
			destroy_trie_tree(root);
			return 0;
		}

	}
*/
}
}
