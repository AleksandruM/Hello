/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Rush00.c                                           :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: zmarth <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/16 15:12:00 by zmarth            #+#    #+#             */
/*   Updated: 2020/08/16 16:04:38 by jgimpkne         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

void		ft_putchar(char c);

void		print_n_symbols(char sym, int n)
{
	int i;

	i = 0;
	while (i++ < n)
	{
		ft_putchar(sym);
	}
}

void		print_exclusive_line(char beg, char fill, char end, int n)
{
	ft_putchar(beg);
	if (n > 0)
		print_n_symbols(fill, n);
	if (n >= 0)
		ft_putchar(end);
	ft_putchar('\n');
}

void		rush(int x, int y)
{
	int		i;
	char	symbols[3];

	i = 1;
	symbols[0] = 'o';
	symbols[1] = '-';
	symbols[2] = '|';
	if (x <= 0 || y <= 0)
	{
		return ;
	}
	print_exclusive_line(symbols[0], symbols[1], symbols[0], x - 2);
	while (i < y - 1)
	{
		print_exclusive_line(symbols[2], ' ', symbols[2], x - 2);
		++i;
	}
	if (i < y)
		print_exclusive_line(symbols[0], symbols[1], symbols[0], x - 2);
}
