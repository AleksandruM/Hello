/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   solution.c                                         :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: cmorrec <marvin@42.fr>                     +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/23 10:21:36 by cmorrec           #+#    #+#             */
/*   Updated: 2020/08/23 12:41:27 by cmorrec          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#define SUCCESS 1
#define ERROR 0

int	check_element(int **tab, int i, int j, int **cond);
int	solve(int **tab, int **cond);
int	find_empty_loc(int **tab, int *i, int *j);

int	solve(int **tab, int **cond)
{
	int	i;
	int	j;
	int num;

	if (find_empty_loc(tab, &i, &j) == ERROR)
		return (SUCCESS);
	num = 0;
	while (++num <= 4)
	{
		tab[i][j] = num;
		if (check_element(tab, i, j, cond) == SUCCESS)
			if (solve(tab, cond) == SUCCESS)
				return (SUCCESS);
	}
	tab[i][j] = 0;
	return (ERROR);
}

int	find_empty_loc(int **tab, int *i, int *j)
{
	*i = 0;
	while (*i < 4)
	{
		*j = 0;
		while (*j < 4)
		{
			if (tab[*i][*j] == 0)
				return (SUCESS);
			*j += 1;
		}
		*i += 1;
	}
	return (ERROR);
}
