/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   main.c                                             :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: cmorrec <marvin@42.fr>                     +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/23 10:49:00 by cmorrec           #+#    #+#             */
/*   Updated: 2020/08/23 13:23:09 by cmorrec          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#define SUCCESS 1
#define ERROR 0
#define ERROR_MEMBER -1

int	make_condition(char *argv, int ***cond);
int	rush(int **cond, int ***tab);
int	ft_free(int **array);

int	main(int argc, char **argv)
{
	int	**cond;
	int **tab;
	int	res;

	if (argc == 2)
	{
		res = make_condition(argv[1], &cond);
		if (res != SUCCESS)
		{
			if (res == ERROR)
				ft_free(cond);
			return (0);
		}
		res = rush(cond, &tab);
		if (res != SUCCESS)
		{
			ft_free(cond);
			return (0);
		}
		display_table(tab);
		ft_free(tab);
		ft_free(cond);
	}
}
