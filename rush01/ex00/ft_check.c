/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_check.c                                         :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: cmorrec <marvin@42.fr>                     +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/22 16:56:54 by cmorrec           #+#    #+#             */
/*   Updated: 2020/08/23 12:49:43 by cmorrec          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#define SUCCESS 1
#define ERROR 0

int	check_element(int **tab, int i, int j, int **cond);
int	check_row_left(int **tab, int i, int j, int cond);
int	check_row_right(int **tab, int i, int j, int cond);
int	check_col_up(int **tab, int i, int j, int cond);
int	check_col_down(int **tab, int i, int j, int cond);

int	check_element(int **tab, int i, int j, int **cond)
{
	if (check_row_left(tab, i, j, cond[2][i]) == SUCCESS)
	{
		if (check_row_right(tab, i, j, cond[3][i]) == SUCCESS)
		{
			if (check_col_up(tab, i, j, cond[0][j]) == SUCCESS)
			{
				return (check_col_down(tab, i, j, cond[1][j]));
			}
			else
			{
				return (ERROR);
			}
		}
		else
		{
			return (ERROR);
		}
	}
	return (ERROR);
}

int	check_row_left(int **tab, int i, int j, int cond)
{
	int	k;
	int	count;
	int	max;

	k = 0;
	count = 0;
	max = tab[i][k];
	if (max != 0)
		count++;
	while (k <= 3)
	{
		if (k != j && tab[i][j] == tab[i][k])
			return (ERROR);
		if (tab[i][k] > max)
		{
			max = tab[i][k];
			count++;
		}
		k++;
	}
	if (count <= cond)
		return (SUCCESS);
	else
		return (ERROR);
}

int	check_row_right(int **tab, int i, int j, int cond)
{
	int	k;
	int	count;
	int	max;

	k = 3;
	count = 0;
	max = tab[i][k];
	if (max != 0)
		count++;
	while (k >= 0)
	{
		if (k != j && tab[i][k] == tab[i][j])
			return (ERROR);
		if (tab[i][k] > max)
		{
			max = tab[i][k];
			count++;
		}
		k--;
	}
	if (count <= cond)
		return (SUCCESS);
	else
		return (ERROR);
}

int	check_col_up(int **tab, int i, int j, int cond)
{
	int	k;
	int	count;
	int	max;

	k = 0;
	count = 0;
	max = tab[k][j];
	if (max != 0)
		count++;
	while (k <= 3)
	{
		if (k != i && tab[k][j] == tab[i][j])
			return (ERROR);
		if (tab[k][j] > max)
		{
			max = tab[k][j];
			count++;
		}
		k++;
	}
	if (count <= cond)
		return (SUCCESS);
	else
		return (ERROR);
}

int	check_col_down(int **tab, int i, int j, int cond)
{
	int	k;
	int	count;
	int	max;

	k = 3;
	count = 0;
	max = tab[k][j];
	if (max != 0)
		count++;
	while (k >= 0)
	{
		if (k != i && tab[k][j] == tab[i][j])
			return (ERROR);
		if (tab[k][j] > max)
		{
			max = tab[k][j];
			count++;
		}
		k--;
	}
	if (count <= cond)
		return (SUCCESS);
	else
		return (ERROR);
}
