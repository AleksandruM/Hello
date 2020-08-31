/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_rev_params.c                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: zmarth <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/20 22:12:16 by zmarth            #+#    #+#             */
/*   Updated: 2020/08/20 22:27:39 by zmarth           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <unistd.h>

void	ft_putchar(char c)
{
	write(1, &c, 1);
}

int		main(int argc, char *argv[])
{
	int i;
	int a;
	int b;

	i = argc - 1;
	a = 1;
	while (i > 0)
	{
		b = 0;
		while (argv[i][b] != '\0')
		{
			ft_putchar(argv[i][b]);
			b++;
		}
		ft_putchar('\n');
		i--;
		a++;
	}
	return (0);
}
