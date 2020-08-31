/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   rush.c                                             :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: cmorrec <marvin@42.fr>                     +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/23 11:30:02 by cmorrec           #+#    #+#             */
/*   Updated: 2020/08/23 13:23:27 by cmorrec          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <unistd.h>
#define SUCCESS 1
#define ERROR 0
#define ERROR_MEMBER -1

int		**ft_mem(void);
void	ft_free(int **tab);
void	display_table(int **tab);
void	put_char(char c);
int		rush(int **cond, int ***tab);
int		solve(int **tab, int **cond);

int		rush(int **cond, int ***tab)
{
	int	**tab_t;
	int	res;

	tab_t = ft_mem();
	if (!tab_t)
		return (ERROR_MEMBER);
	res = solve(cond, tab_t);
	if (res == ERROR)
	{
		write(1, "Error\n", 6);
		ft_free(tab_t);
		return (ERROR);
	}
	*tab = tab_t;
	return (SUCCESS);
}

void	put_char(char c)
{
	write(1, &c, 1);
}

void	display_table(int **tab)
{
	int	i;
	int	j;

	i = 0;
	while (i < 4)
	{
		j = 0;
		while (j < 4)
		{
			put_char(tab[i][j] + '0');
			put_char(' ');
			j++;
		}
		put_char('\n');
		i++;
	}
}
