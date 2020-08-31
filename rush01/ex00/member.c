/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   member.c                                           :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: cmorrec <marvin@42.fr>                     +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/23 11:37:08 by cmorrec           #+#    #+#             */
/*   Updated: 2020/08/23 12:29:11 by cmorrec          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <stdlib.h>

int		**ft_mem(void);
void	ft_free(int **array);
int		**make_null_tab(int **tab);

int		**ft_mem(void)
{
	int	**tab;
	int	i;

	tab = (int**)malloc(4 * sizeof(int*));
	i = 0;
	while (i < 4)
	{
		tab[i] = (int*)malloc(4 * sizeof(int));
		i++;
	}
	tab = make_null_tab(tab);
	return (tab);
}

void	ft_free(int **array)
{
	int	i;

	i = 0;
	while (i < 4)
	{
		free(array[i]);
		i++;
	}
	free(array);
}

int		**make_null_tab(int **tab)
{
	int	i;
	int	j;

	i = 0;
	while (i < 4)
	{
		j = 0;
		while (j < 4)
		{
			tab[i][j] = 0;
			j++;
		}
		i++;
	}
	return (tab);
}
